public class Muunnos {
    private char muunnettava;
    private char muunnettu;
    
    public Muunnos(char muunnettava, char muunnos){
        this.muunnettava=muunnettava;
        this.muunnettu=muunnos;
    }
    
    public String muunna(String merkkijono){
        merkkijono=merkkijono.replace(this.muunnettava, this.muunnettu);
        return merkkijono;
    }
}
