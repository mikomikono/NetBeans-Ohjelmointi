
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi 
                && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi 
                && this.kuukausi == verrattava.kuukausi
                && this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }
    
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
