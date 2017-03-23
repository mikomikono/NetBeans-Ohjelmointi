
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int pv, int kk, int vv) {
        this.paiva = pv;
        this.kuukausi = kk;
        this.vuosi = vv;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        // ensin verrataan vuosia
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        // jos vuodet ovat samat, verrataan kuukausia
        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        // vuodet ja kuukaudet samoja, verrataan päivää
        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

    /*
     * Aiemmassa tehtävässä lisättiin luokalle metodi erotusVuosissa
     * Kannattaa kopioida metodi tänne, se helpottaa tehtävän tekemistä oleellisesti!
     */
    public int erotusVuosissa(Paivays verrattava){
        if (!this.aiemmin(verrattava)) {
            int paivaErotus=this.paiva-verrattava.paiva;
            int kuukausiErotus=this.kuukausi-verrattava.kuukausi;
            int vuosiErotus=this.vuosi-verrattava.vuosi;
            if (paivaErotus<0){
                kuukausiErotus--;
            }
            if (kuukausiErotus<0){
                vuosiErotus--;
            }
            return vuosiErotus;
        } else {
            int paivaErotus=verrattava.paiva-this.paiva;
            int kuukausiErotus=verrattava.kuukausi-this.kuukausi;
            int vuosiErotus=verrattava.vuosi-this.vuosi;
            if (paivaErotus<0){
                kuukausiErotus--;
            }
            if (kuukausiErotus<0){
                vuosiErotus--;
            }
            return vuosiErotus;
        }
    }


}
