
import java.util.ArrayList;
import java.util.List;

public class Pomo implements Tyontekija {
private String nimi;
    private int palkka;
    private List<String> kielet;
    private List<Tyontekija> alaiset;

    public Pomo(String nimi, int palkka) {
        this.nimi = nimi;
        this.palkka = palkka;
        this.kielet = new ArrayList<>();
        this.alaiset = new ArrayList<>();
    }

    @Override
    public String haeNimi() {
        return this.nimi;
    }

    @Override
    public int haePalkka() {
        return this.palkka;
    }

    @Override
    public int laskeAlaiset() {
        int yhteensa = 0;
        for (Tyontekija alainen : this.alaiset){
            yhteensa+=1+alainen.laskeAlaiset();
        }
        return yhteensa;
    }

    @Override
    public void lisaaKieli(String kieli) {
        this.kielet.add(kieli);
    }

    @Override
    public boolean onkoTaitoa(String kieli) {
        if (this.kielet.contains(kieli)){
            return true;
        }
        for (Tyontekija alainen : this.alaiset) {
            if (alainen.onkoTaitoa(kieli)){
                return true;
            }
        }
        return false;
    }
    
    public void lisaaAlainen(Tyontekija alainen){
        this.alaiset.add(alainen);
    }
}
