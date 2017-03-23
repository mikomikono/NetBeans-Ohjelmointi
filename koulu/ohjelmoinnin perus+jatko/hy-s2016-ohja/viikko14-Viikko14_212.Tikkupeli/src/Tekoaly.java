
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Tekoaly {
    private HashMap<Integer, ArrayList<Integer>> hatut;
    private HashMap<Integer, Integer> kaytetytPallot;
    
    public Tekoaly(){
        this.hatut= new HashMap<>();
        this.kaytetytPallot = new HashMap<>();
    }
    
    public void luoHatut(int tikut){
        ArrayList<Integer> pallot = new ArrayList<>();
        pallot.add(1);
        pallot.add(2);
        pallot.add(3);
        for (int i=1; i<=tikut; i++){
            this.hatut.put(i, pallot);
        }
    }
    
    public int pelaa(int tikut){
        ArrayList<Integer> pallot = hatut.get(tikut);
        Collections.shuffle(pallot);
        int valinta = pallot.get(0);
        kaytetytPallot.put(tikut, valinta);
        return valinta;
    }
    
    public void opi(boolean voittiko){
        if (voittiko){
            for (int i : this.kaytetytPallot.keySet()){
                int voittoPallo = this.kaytetytPallot.get(i);
                ArrayList<Integer> pallot = this.hatut.get(i);
                pallot.add(voittoPallo);
                this.hatut.replace(i, pallot);
            }
        } else {
            for (int i : this.kaytetytPallot.keySet()){
                int havioPallo = this.kaytetytPallot.get(i);
                ArrayList<Integer> pallot = this.hatut.get(i);
                int x = pallot.indexOf(havioPallo);
                pallot.remove(x);
                if (!pallot.contains(havioPallo)){
                    pallot.add(havioPallo);
                }
                this.hatut.replace(i, pallot);
            }
        }
    }
}
