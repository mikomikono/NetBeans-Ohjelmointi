public class Tavara {
    private int paino;
    private String nimi;
    
    public Tavara(String nimi, int paino){
        this.nimi=nimi;
        this.paino=paino;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getPaino(){
        return this.paino;
    }
    
    @Override
    public String toString(){
        return this.nimi+" ("+this.paino+" kg)";
    }
}
