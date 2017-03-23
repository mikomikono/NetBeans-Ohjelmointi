
public class Kulkukortti {

    private String omistaja;
    private int viimeinenPaiva;
    private int viimeinenKuukausi;
    private int viimeinenVuosi;

    /*
     * Luo uuden kulkukortin annetulle omistajalle.
     */
    public Kulkukortti(String omistaja) {
        this.omistaja = omistaja;
        this.viimeinenPaiva = -1;
        this.viimeinenKuukausi = -1;
        this.viimeinenVuosi = -1;
    }

    /*
     * Asettaa kortin viimeisen voimassaoloajan. Voidaan käyttää myös uuden
     * voimassaoloajan asettamiseen.
     */
    public void asetaViimeinenVoimassaolopaiva(int paiva, int kuukausi, int vuosi) {
        this.viimeinenPaiva = paiva;
        this.viimeinenKuukausi = kuukausi;
        this.viimeinenVuosi = vuosi;
    }

    /*
     * Palauttaa omistajan nimen
     */
    public String annaOmistaja() {
        return omistaja;
    }

    /*
     * Palauttaa kortin viimeisen voimassaolopäivän
     */
    public int annaViimeinenPaiva() {
        return viimeinenPaiva;
    }

    /*
     * Palauttaa kortin viimeisen voimassaolokuukauden
     */
    public int annaViimeinenKuukausi() {
        return viimeinenKuukausi;
    }

    /*
     * Palauttaa kortin viimeisen voimassaolovuoden
     */
    public int annaViimeinenVuosi() {
        return viimeinenVuosi;
    }

    @Override
    public String toString() {
        return this.omistaja + " (" + this.annaViimeinenPaiva() + ". " + this.annaViimeinenKuukausi() + ". " + this.annaViimeinenVuosi() + ")";
    }
}
