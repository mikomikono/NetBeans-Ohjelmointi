public class Lintu {
    private String nimi;
    private String latinaNimi;
    private int havainnot;
    
    public Lintu(String nimi, String latNimi){
        this.nimi=nimi;
        this.latinaNimi=latNimi;
        this.havainnot=0;
    }
    
    public void lisaaHavainto(){
        this.havainnot++;
    }
    
    public String haeNimi(){
        return this.nimi;
    }
    
    
    @Override
    public String toString(){
        return this.nimi + " ("+this.latinaNimi+"): "+this.havainnot+" havaintoa";
    }
}
