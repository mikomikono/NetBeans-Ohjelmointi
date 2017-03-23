import java.util.Calendar;

public class Henkilo {
    private String nimi;
    private Paivays syntymapaiva;
    
    public Henkilo(String nimi, int pp, int kk, int vv) {
        this.nimi = nimi;
        this.syntymapaiva = new Paivays(pp, kk, vv);
    }
    
    public Henkilo(String nimi, Paivays syntymapaiva){
        this.nimi=nimi;
        this.syntymapaiva=syntymapaiva;
    }
    
    public Henkilo(String nimi){
        this.nimi=nimi;
        this.syntymapaiva=new Paivays(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1 ,Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public int ika() {
        // laske henkilön ikä syntymäpäivän ja tämän päivän perusteella
        // tämä päivä saadaan selville seuraavasti
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // tammikuun numero on 0 joten lisätään 1
        // Calendar.getInstance().get(Calendar.YEAR);
        Paivays tanaan = new Paivays(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1 ,Calendar.getInstance().get(Calendar.YEAR));
        return tanaan.erotusVuosissa(this.syntymapaiva);
    }
    
    public boolean vanhempiKuin(Henkilo verrattava) {
        // vertaa henkilöiden ikiä käyttäen henkilöiden syntymäpäivää
        if (this.syntymapaiva.aiemmin(verrattava.syntymapaiva)){
            return true;
        }
        return false;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String toString() {
        return this.nimi + ", syntynyt " + this.syntymapaiva;
    }
    
}
