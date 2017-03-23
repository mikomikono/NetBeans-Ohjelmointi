
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rengastustoimisto {
    private Map<Lintu, List<String>> rekisteri;
    
    public Rengastustoimisto(){
        rekisteri = new HashMap<>();
    }
    
    public void havaitse(Lintu lintu, String paikka){
        for (Lintu l:rekisteri.keySet()){
            if (l.equals(lintu)){
                List<String> havainnot = rekisteri.get(l);
                havainnot.add(paikka);
                rekisteri.replace(l, havainnot);
            }
        }
        if (!rekisteri.containsKey(lintu)){
            List<String> paikat = new ArrayList<>();
            paikat.add(paikka);
            rekisteri.put(lintu, paikat);
        }
    }
    
    public void havainnot(Lintu lintu){
        if (rekisteri.containsKey(lintu)){
            List<String> paikat = rekisteri.get(lintu);
            System.out.println(lintu+" havaintoja: "+ paikat.size());
            for (String paikka:paikat){
                System.out.println(paikka);
            }
        } else {
            System.out.println(lintu+" havaintoja: 0");
        }
    }
}
