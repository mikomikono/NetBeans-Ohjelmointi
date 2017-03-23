package jarjestys;

public class Kirja implements Comparable<Kirja> {
    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getVuosi(){
        return this.julkaisuvuosi;
    }
    
    @Override
    public String toString(){
        return "  "+this.nimi+" ("+this.julkaisuvuosi+")";
    }

    @Override
    public int compareTo(Kirja k) {
        if (this.nimi.equals(k.nimi)){
            return this.julkaisuvuosi-k.julkaisuvuosi;
        } else {
            return this.nimi.compareTo(k.nimi);
        }
    }
}
