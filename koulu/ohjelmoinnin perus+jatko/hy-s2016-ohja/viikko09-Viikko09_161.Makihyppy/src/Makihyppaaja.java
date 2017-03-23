
import java.util.ArrayList;
import java.util.Collections;

public class Makihyppaaja implements Comparable<Makihyppaaja> {
    private String nimi;
    private int pisteet;
    private ArrayList<Hyppy> hypyt;
    
    public Makihyppaaja(String nimi){
        this.nimi=nimi;
        this.pisteet=0;
        this.hypyt=new ArrayList<>();
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getPisteet(){
        return this.pisteet;
    }
    
    public int hypynPituus(int i){
        return hypyt.get(i).hypynPituus();
    }
    
    public ArrayList hypynPisteet(int i){
        return hypyt.get(i).hypynPisteet();
    }
    
    public void hyppaa(){
        Hyppy hyppy=new Hyppy();
        hypyt.add(hyppy);
        ArrayList<Integer> hypynPisteet=hyppy.hypynPisteet();
        Collections.sort(hypynPisteet);
        for (int i=1;i<4;i++){
            pisteet+=hypynPisteet.get(i);
        }
        pisteet+=hyppy.hypynPituus();
    }
    
    @Override
    public int compareTo(Makihyppaaja hyppaaja){
        return 0;
    }
    
    
    @Override
    public String toString(){
        return this.nimi +" ("+this.pisteet+" pistettä)";
    }
}
