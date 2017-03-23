
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }
        if (senttia<0){
            while (senttia<0){
                euroa--;
                senttia+=100;
            }
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }
    
    public Raha plus(Raha lisattava){
        Raha uusi = new Raha(lisattava.euroa+this.euroa,lisattava.senttia+this.senttia);
        return uusi;
    }
    
    public Raha miinus(Raha vahennettava){
        Raha uusi = new Raha(this.euroa-vahennettava.euroa,this.senttia-vahennettava.senttia);
        if (uusi.euroa<0){
            Raha nolla = new Raha(0,0);
            return nolla;
        }
        return uusi;
    }
    
    public boolean vahemman(Raha verrattava){
        if (this.euroa<verrattava.euroa) {
            return true;
        } else if (this.euroa<=verrattava.euroa&&this.senttia<verrattava.senttia){
            return true;
        } else {
            return false;
        }
    }

}
