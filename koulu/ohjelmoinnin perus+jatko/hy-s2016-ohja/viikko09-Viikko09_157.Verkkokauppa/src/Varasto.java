
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Varasto {
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldot;
    
    public Varasto(){
        this.hinnat=new HashMap<>();
        this.saldot=new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo){
        hinnat.put(tuote, hinta);
        saldot.put(tuote, saldo);
    }
    
    public int hinta(String tuote){
        if (hinnat.containsKey(tuote)){
            return hinnat.get(tuote);
        }
        return -99;
    }
    
    public int saldo(String tuote){
        if(saldot.containsKey(tuote)){
            return saldot.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote){
        if (saldot.containsKey(tuote)&&saldot.get(tuote)>0){
            int i=saldot.get(tuote)-1;
            saldot.put(tuote, i);
            return true;
        }
        return false;
    }
    
    public Set<String> tuotteet(){
        Set<String> tuotteet=new HashSet<>();
        for (String tuote: hinnat.keySet()){
            tuotteet.add(tuote);
        }
        return tuotteet;
    }
}
