package perintaa;

public abstract class Elain {
    private String nimi;
    
    public Elain(String nimi){
        this.nimi=nimi;
    }
    
    public void nuku(){
        System.out.println(this.nimi+" nukkuu");
    }
    
    public void syo(){
        System.out.println(this.nimi+" syo");
    }
    
    public String getNimi(){
        return this.nimi;
    }
}
