public class CDLevy implements Talletettava {
    private String artisti;
    private String nimi;
    private int julkaisuvuosi;
    private final double paino;
    
    public CDLevy(String artisti, String nimi, int vuosi){
        this.artisti=artisti;
        this.nimi=nimi;
        this.julkaisuvuosi=vuosi;
        this.paino=0.1;
    }
    
    @Override
    public String toString(){
        return this.artisti+": "+this.nimi+" ("+this.julkaisuvuosi+")";
    }
    
    @Override
    public double paino(){
        return this.paino;
    }
}
