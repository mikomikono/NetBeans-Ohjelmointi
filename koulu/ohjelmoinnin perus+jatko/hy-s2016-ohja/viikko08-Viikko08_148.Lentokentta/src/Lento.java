public class Lento {
    private Lentokone kone;
    private String lahto;
    private String kohde;
    
    public Lento(Lentokone kone, String lahto, String kohde){
        this.kone=kone;
        this.lahto=lahto;
        this.kohde=kohde;
    }
    
    public void tulostaLento(){
        System.out.println(this.kone+" ("+this.lahto+"-"+this.kohde+")");
    }
}
