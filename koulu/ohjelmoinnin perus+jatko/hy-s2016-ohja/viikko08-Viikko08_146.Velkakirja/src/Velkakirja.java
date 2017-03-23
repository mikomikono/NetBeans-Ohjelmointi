import java.util.HashMap;

public class Velkakirja {
    private HashMap<String, Double> velat;
    
    public Velkakirja(){
        this.velat = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara){
        this.velat.put(kenelle, maara);
    }
    
    public double paljonkoVelkaa(String kuka){
        double velkaa=0;
        if (velat.containsKey(kuka)){
            velkaa=velat.get(kuka);
        }
        return velkaa;
    }
}
