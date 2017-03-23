package varastonhallinta;

public class Esine {
    private String nimi;
    
    public Esine(String nimi) {
        this.nimi = nimi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    @Override
    public String toString(){
        return "	" + this.nimi;
    }
}
