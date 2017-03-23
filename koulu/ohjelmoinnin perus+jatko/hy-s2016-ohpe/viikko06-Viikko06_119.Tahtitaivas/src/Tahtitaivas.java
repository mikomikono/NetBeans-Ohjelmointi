import java.util.Random;

public class Tahtitaivas {
    private double tiheys;
    private int leveys;
    private int korkeus;
    private Random random;
    private int tahtia;
    
    public Tahtitaivas(double tiheys){
        this.tiheys=tiheys;
        this.leveys=20;
        this.korkeus=10;
    }
    
    public Tahtitaivas(int leveys, int korkeus){
        this.tiheys=0.1;
        this.leveys=leveys;
        this.korkeus=korkeus;
    }
    
    public Tahtitaivas(double tiheys, int leveys, int korkeus){
        this.tiheys=tiheys;
        this.leveys=leveys;
        this.korkeus=korkeus;
    }
    
    public void tulostaRivi(){
        for(int i=0;i<this.leveys;i++){
            this.random= new Random();
            double todennakoisyys=this.random.nextDouble();
            if (todennakoisyys<=this.tiheys){
                System.out.print("*");
                tahtia++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
    public void tulosta(){
        this.tahtia=0;
        for (int i=0;i<this.korkeus;i++){
            this.tulostaRivi();
        }
    }
    
    public int tahtiaViimeTulostuksessa(){
        return this.tahtia;
    }
    
}
