
import java.util.ArrayList;
import java.util.List;

public class Koodari implements Tyontekija {
    private String nimi;
    private int palkka;
    private List<String> kielet;

    public Koodari(String nimi, int palkka) {
        this.nimi = nimi;
        this.palkka = palkka;
        this.kielet = new ArrayList<>();
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
        return 0;
    }

    @Override
    public void lisaaKieli(String kieli) {
        this.kielet.add(kieli);
    }

    @Override
    public boolean onkoTaitoa(String kieli) {
        return this.kielet.contains(kieli);
    }
    
}
