import java.util.Random;
import java.util.ArrayList;

public class Hyppy {
    private int pituus;
    private ArrayList<Integer> pisteet;
    public Random random=new Random();
    
    public Hyppy(){
        this.pituus=random.nextInt(121);
        while (pituus<60){
            pituus=random.nextInt(121);
        }
        this.pisteet=new ArrayList<>();
        for(int i=0;i<5;i++){
            int piste=random.nextInt(21);
            while(piste<10){
                piste=random.nextInt(21);
            }
            pisteet.add(piste);
        }
    }
    
    public int hypynPituus(){
        return this.pituus;
    }
    
    public ArrayList hypynPisteet(){
        return this.pisteet;
    }
    
    @Override
    public String toString(){
        return this.pituus+" m";
    }
}
