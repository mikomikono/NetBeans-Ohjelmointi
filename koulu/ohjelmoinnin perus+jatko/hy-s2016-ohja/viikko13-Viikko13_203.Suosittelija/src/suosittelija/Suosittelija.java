package suosittelija;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Arvio;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Henkilo;
import suosittelija.comparator.ElokuvaComparator;
import suosittelija.comparator.HenkiloComparator;

public class Suosittelija {
    private ArvioRekisteri rekisteri;
    
    public Suosittelija(ArvioRekisteri rekisteri){
        this.rekisteri = rekisteri;
    }
    
    public Elokuva suositteleElokuva(Henkilo henkilo){
        List<Elokuva> elokuvat = rekisteri.elokuvat();
        Collections.sort(elokuvat, new ElokuvaComparator(rekisteri.elokuvienArviot()));
        if (!rekisteri.arvioijat().contains(henkilo)){
            return elokuvat.get(0);            
        }
        Map<Henkilo, Integer> samuudet = new HashMap<>();
        List<Henkilo> arvioijat = rekisteri.arvioijat();
        Iterator<Henkilo> henkiloIteraattori = arvioijat.iterator();
        while (henkiloIteraattori.hasNext()){
            Henkilo h = henkiloIteraattori.next();
            if (h.equals(henkilo)){
                henkiloIteraattori.remove();
            } else {
                int summa = 0;
                for (Elokuva elokuva : elokuvat){
                    summa+=rekisteri.haeArvio(henkilo, elokuva).getArvo()*rekisteri.haeArvio(h, elokuva).getArvo();
                }
                samuudet.put(h, summa);
            }
        }
        Collections.sort(arvioijat, new HenkiloComparator(samuudet));
        Henkilo suosittelija = arvioijat.get(0);
        List<Elokuva> suosittelijanElokuvat = new ArrayList<>();
        for (Elokuva e : rekisteri.annaHenkilonArviot(suosittelija).keySet()){
            suosittelijanElokuvat.add(e);
        }
        if (suosittelijanElokuvat.size()==1){
            return suosittelijanElokuvat.get(0);
        }
        Iterator<Elokuva> elokuvaIteraattori = suosittelijanElokuvat.iterator();
        while (elokuvaIteraattori.hasNext()){
            Elokuva e = elokuvaIteraattori.next();
            if (rekisteri.annaHenkilonArviot(henkilo).containsKey(e)){
                elokuvaIteraattori.remove();
            } else if (rekisteri.haeArvio(suosittelija, e).getArvo()<=1){
                elokuvaIteraattori.remove();
            }
        }
        if (suosittelijanElokuvat.isEmpty()){
            return null;
        }
        Collections.sort(suosittelijanElokuvat, new ElokuvaComparator("ugh",rekisteri.annaHenkilonArviot(suosittelija)));
        return suosittelijanElokuvat.get(0);
    }
}
