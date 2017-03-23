
import java.util.ArrayList;

public class Laatikko implements Talletettava{
    private ArrayList<Talletettava> talletetut;
    private double maksimiPaino;
    private int tavaraMaara;
    
    public Laatikko(double maksimiPaino){
        this.maksimiPaino=maksimiPaino;
        talletetut= new ArrayList<>();
        tavaraMaara=0;
    }
    
    public void lisaa(Talletettava talletettava){
        if (paino()+talletettava.paino()<=this.maksimiPaino){
            talletetut.add(talletettava);
            tavaraMaara++;
        }
    }
    
    @Override
    public String toString(){
        return "Laatikko: "+this.tavaraMaara+" esinettä, paino yhteensä "+paino()+" kiloa";
    }
    
    @Override
    public double paino(){
        double paino=0;
        for (Talletettava tavara:talletetut){
            paino+=tavara.paino();
        }
        return paino;
    }
}
