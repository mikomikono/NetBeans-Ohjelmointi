import java.util.HashMap;
import java.util.Map;

public class Ostoskori {
    private Map<String, Ostos> ostokset;
    
    public Ostoskori(){
        ostokset= new HashMap<>();
    }
    
    public void lisaa(String tuote, int hinta){
        if(ostokset.containsKey(tuote)){
            ostokset.get(tuote).kasvataMaaraa();
        } else {
            Ostos ostos = new Ostos(tuote, 1, hinta);
            ostokset.put(tuote, ostos);
        }
    }
    
    public int hinta(){
        int hinta=0;
        for (String ostos:ostokset.keySet()){
            hinta+=ostokset.get(ostos).hinta();
        }
        return hinta;
    }
    
    public void tulosta(){
        for (String ostos:ostokset.keySet()){
            System.out.println(ostokset.get(ostos));
        }
    }
}
