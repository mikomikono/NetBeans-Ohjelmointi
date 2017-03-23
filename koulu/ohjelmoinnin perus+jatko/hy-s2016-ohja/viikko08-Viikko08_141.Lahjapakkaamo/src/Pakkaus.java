import java.util.ArrayList;

public class Pakkaus {
    private ArrayList<Lahja> pakkaus;

    
    public Pakkaus(){
        this.pakkaus= new ArrayList<>();

    }
    
    public void lisaaLahja(Lahja lahja){
        this.pakkaus.add(lahja);

    }
    
    public int getPaino(){
        int yhteisPaino=0;
        for (Lahja lahja : pakkaus){
            yhteisPaino+=lahja.getPaino();
        }
        return yhteisPaino;
    }
}
