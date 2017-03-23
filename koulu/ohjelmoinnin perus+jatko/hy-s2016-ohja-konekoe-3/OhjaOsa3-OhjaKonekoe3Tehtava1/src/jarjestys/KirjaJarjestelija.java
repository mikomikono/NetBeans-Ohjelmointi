package jarjestys;

import java.util.*;

public class KirjaJarjestelija {
    
    public KirjaJarjestelija() {
        
    }
    
    public List<Kirja> aakkosittain(List<Kirja> kirjat) {
        ArrayList<String> nimet = new ArrayList<>();
        ArrayList<Kirja> jarjestellytKirjat = new ArrayList<>();
        for (Kirja kirja : kirjat) {
            nimet.add(kirja.getNimi());
        }
        Collections.sort(nimet);
        for (String nimi : nimet) {
            for (Kirja kirja : kirjat) {
                if (nimi.equals(kirja.getNimi())) {
                    jarjestellytKirjat.add(kirja);
                }
            }
        }
        return jarjestellytKirjat;
    }
    
    public List<Kirja> vuosittain(List<Kirja> kirjat) {
        ArrayList<Integer> vuodet = new ArrayList<>();
        ArrayList<Kirja> jarjestellytKirjat = new ArrayList<>();
        for (Kirja kirja : kirjat) {
            vuodet.add(kirja.getVuosi());
        }
        Collections.sort(vuodet);
        for (int vuosi : vuodet) {
            for (Kirja kirja : kirjat) {
                if (vuosi == kirja.getVuosi()) {
                    jarjestellytKirjat.add(kirja);
                }
            }
        }
        return jarjestellytKirjat;
    }
    
    public List<Kirja> molemmat(List<Kirja> kirjat) {
        Collections.sort(kirjat);
        return kirjat;
    }
}
