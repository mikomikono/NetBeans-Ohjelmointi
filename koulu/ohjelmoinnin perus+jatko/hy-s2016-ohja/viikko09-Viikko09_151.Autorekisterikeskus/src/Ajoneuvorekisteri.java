import java.util.ArrayList;
import java.util.HashMap;

public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat;
    
    public Ajoneuvorekisteri(){
        omistajat=new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja){
        if (omistajat.containsKey(rekkari)){
            return false;
        } else {
            omistajat.put(rekkari, omistaja);
            return true;
        }
    }
    
    public String hae(Rekisterinumero rekkari){
        if (omistajat.containsKey(rekkari)){
            return omistajat.get(rekkari);
        }
        return null;
    }
    
    public boolean poista(Rekisterinumero rekkari){
        if (omistajat.containsKey(rekkari)){
            omistajat.remove(rekkari);
            return true;
        }
        return false;
    }
    
    public void tulostaRekisterinumerot(){
        for (Rekisterinumero rekkari: this.omistajat.keySet()){
            System.out.println(rekkari);
        }
    }
    
    public void tulostaOmistajat(){
        ArrayList<String>nimet=new ArrayList<>();
        for (Rekisterinumero rekkari: this.omistajat.keySet()){
            String nimi=omistajat.get(rekkari);
            if (!nimet.contains(nimi)){
                nimet.add(nimi);
                System.out.println(nimi);
            }
        }
    }
}
