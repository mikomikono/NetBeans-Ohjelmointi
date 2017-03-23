package henkilosto;

public class Paaohjelma {

    public static void main(String[] args) {
        Tyontekijat yliopisto = new Tyontekijat();
        yliopisto.lisaa(new Henkilo("Matti", Koulutus.FilYO));
        yliopisto.lisaa(new Henkilo("Pekka", Koulutus.LuK));
        yliopisto.lisaa(new Henkilo("Arto", Koulutus.FM));
        yliopisto.lisaa(new Henkilo("Minna", Koulutus.FT));

        yliopisto.tulosta();
        System.out.println("");
        yliopisto.irtisano(Koulutus.FT);

        System.out.println("==");

        yliopisto.tulosta();
    }
}
