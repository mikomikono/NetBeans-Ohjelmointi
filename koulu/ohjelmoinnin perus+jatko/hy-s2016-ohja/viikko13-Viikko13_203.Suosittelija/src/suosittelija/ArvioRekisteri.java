package suosittelija;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Arvio;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Henkilo;

public class ArvioRekisteri {
    private Map<Elokuva, List<Arvio>> arviot;
    private Map<Henkilo, Map<Elokuva, Arvio>> henkilokohtaisetArviot;
    
    public ArvioRekisteri(){
        this.arviot = new HashMap<>();
        this.henkilokohtaisetArviot= new HashMap<>();
    }
    
    public void lisaaArvio(Elokuva elokuva, Arvio arvio){
        if (this.arviot.containsKey(elokuva)){
            List<Arvio> arvioita = this.arviot.get(elokuva);
            arvioita.add(arvio);
            this.arviot.replace(elokuva, arvioita);
        } else {
            List<Arvio> arvioita = new ArrayList<>();
            arvioita.add(arvio);
            this.arviot.put(elokuva, arvioita);
        }
    }
    
    public void lisaaArvio(Henkilo henkilo, Elokuva elokuva, Arvio arvio){
        if (this.henkilokohtaisetArviot.containsKey(henkilo)){
            boolean eiOleArvioinut = true;
            Map<Elokuva, Arvio> arvioinnit = this.henkilokohtaisetArviot.get(henkilo);
            for (Elokuva e : arvioinnit.keySet()){
                if (e.equals(elokuva)){
                    eiOleArvioinut = false;
                }
            }
            if (eiOleArvioinut){
                List<Arvio> arvioita = new ArrayList<>();
                if (this.arviot.containsKey(elokuva)){
                    arvioita = this.arviot.get(elokuva);
                }
                Map<Elokuva, Arvio> henkkoht = this.henkilokohtaisetArviot.get(henkilo);
                arvioita.add(arvio);
                this.arviot.put(elokuva, arvioita);
                henkkoht.put(elokuva, arvio);
                this.henkilokohtaisetArviot.put(henkilo, henkkoht);
            }
        } else {
            List<Arvio> arvioita = new ArrayList<>();
            if (this.arviot.containsKey(elokuva)){
                arvioita = this.arviot.get(elokuva);
            }
            Map<Elokuva, Arvio> henkkoht = new HashMap<>();
            arvioita.add(arvio);
            this.arviot.put(elokuva, arvioita);
            henkkoht.put(elokuva, arvio);
            this.henkilokohtaisetArviot.put(henkilo, henkkoht);
        }
    }
    
    public List<Arvio> annaArviot(Elokuva elokuva){
        return arviot.get(elokuva);
    }
    
    public Map<Elokuva, List<Arvio>> elokuvienArviot(){
        return this.arviot;
    }
    
    public Arvio haeArvio(Henkilo henkilo, Elokuva elokuva){
        if (this.henkilokohtaisetArviot.containsKey(henkilo)){
            Map<Elokuva, Arvio> henkkoht = this.henkilokohtaisetArviot.get(henkilo);
            if (henkkoht.containsKey(elokuva)){
                return henkkoht.get(elokuva);
            }
        }
        return Arvio.EI_NAHNYT;
    }
    
    public Map<Elokuva, Arvio> annaHenkilonArviot(Henkilo henkilo){
        if (this.henkilokohtaisetArviot.containsKey(henkilo)){
            Map<Elokuva, Arvio> henkkoht = this.henkilokohtaisetArviot.get(henkilo);
            return henkkoht;
        }
        return new HashMap<>();
    }
    
    public List<Henkilo> arvioijat(){
        List<Henkilo> henkilot = new ArrayList<>();
        for (Henkilo henkilo : this.henkilokohtaisetArviot.keySet()){
            henkilot.add(henkilo);
        }
        return henkilot;
    }
    
    public List<Elokuva> elokuvat(){
        List<Elokuva> elokuvat = new ArrayList<>();
        for (Elokuva elokuva : this.arviot.keySet()){
            elokuvat.add(elokuva);
        }
        return elokuvat;
    }
}
