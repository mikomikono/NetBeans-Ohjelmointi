package varastonhallinta;

import java.util.*;

public class Varasto {
    private String nimi;
    private List<Esine> sisalto;

    public Varasto(String nimi) {
        this.nimi = nimi;
        this.sisalto = new ArrayList<>();
    }
    
    public void lisaaEsine(String nimi) {
        Esine esine = new Esine(nimi);
        sisalto.add(esine);
    }
    
    public void poistaEsine(String nimi) {
        Esine poistettava = etsiEsine(nimi);
        if (poistettava!=null) {
            sisalto.remove(poistettava);
        }
    }
    
    public boolean haeEsine(String esine) {
        return etsiEsine(esine)!=null;
    }
    
    public String getNimi() {
        return this.nimi;
    }

    private Esine etsiEsine(String nimi) {
        Esine esine = null;
        for (Esine e : sisalto) {
            if (e.getNimi().equals(nimi)) {
                esine = e;
            }
        }
        return esine;
    }
    
    @Override
    public String toString(){
        String esineet = "";
        for (Esine esine : this.sisalto) {
            esineet+=esine+"\n";
        }
        return esineet;
    }
}
