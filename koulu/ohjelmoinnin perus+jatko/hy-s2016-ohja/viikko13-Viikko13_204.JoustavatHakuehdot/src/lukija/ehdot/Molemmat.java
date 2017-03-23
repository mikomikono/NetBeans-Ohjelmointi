package lukija.ehdot;

public class Molemmat implements Ehto {
    private Ehto ehto1;
    private Ehto ehto2;
    
    public Molemmat(Ehto e1, Ehto e2){
        this.ehto1=e1;
        this.ehto2=e2;
    }

    @Override
    public boolean toteutuu(String rivi) {
        return this.ehto1.toteutuu(rivi)&&this.ehto2.toteutuu(rivi);
    }
    
}
