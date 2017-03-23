public class Kirja implements Comparable<Kirja> {
    private String nimi;
    private int suositusIka;
    
    public Kirja(String nimi, int ika){
        this.nimi=nimi;
        this.suositusIka=ika;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getIka(){
        return this.suositusIka;
    }
    
    @Override
    public String toString(){
        return "  "+this.nimi+" ("+this.suositusIka+" vuotiaille ja vanhemmille)";
    }
    
    @Override
    public int compareTo(Kirja verrattava){
        int luku = this.suositusIka-verrattava.suositusIka;
        if(luku==0){
            return this.nimi.compareTo(verrattava.nimi);
        } else {
            return luku;
        }
    }
}
