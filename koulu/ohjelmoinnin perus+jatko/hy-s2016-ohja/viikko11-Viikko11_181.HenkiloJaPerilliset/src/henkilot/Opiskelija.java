package henkilot;

public class Opiskelija extends Henkilo {
    private int opintopisteet;
    
    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opintopisteet=0;
    }
    
    public void opiskele(){
        this.opintopisteet++;
    }
    
    public int opintopisteita(){
        return this.opintopisteet;
    }
    
    @Override
    public String toString(){
        return super.getNimi()+"\n"+
                "  "+super.getOsoite()+"\n"+
                "  opintopisteitä "+this.opintopisteet;
    }
}
