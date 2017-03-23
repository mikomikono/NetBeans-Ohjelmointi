import java.util.ArrayList;
import java.util.HashMap;

public class Sanakirja {
    private HashMap<String, String> kaannokset;
    
    public Sanakirja(){
        kaannokset=new HashMap<>();
    }
    
    public String kaanna(String sana){
        if (kaannokset.containsKey(sana)){
            return kaannokset.get(sana);
        } else {
            return null;
        }
    }
    
    public void lisaa(String sana, String kaannos){
        kaannokset.put(sana, kaannos);
    }
    
    public int sanojenLukumaara(){
        int sanoja=kaannokset.size();
        return sanoja;
    }
    
    public ArrayList<String> kaannoksetListana(){
        ArrayList<String> kaannosLista=new ArrayList<>();
        for (String avain : kaannokset.keySet()){
            String kaannos = avain+" = "+ kaannokset.get(avain);
            kaannosLista.add(kaannos);
        }
        return kaannosLista;
    }
}
