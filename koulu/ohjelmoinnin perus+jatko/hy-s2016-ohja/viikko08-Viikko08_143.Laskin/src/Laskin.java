
public class Laskin {
    private Lukija lukija;
    private int laskuja;
    
    public Laskin(){
        lukija= new Lukija();
        laskuja=0;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("komento: ");
            String komento = lukija.lueMerkkijono();
            if (komento.equals("lopetus")) {
                break;
            }

            if (komento.equals("summa")) {
                summa();
            } else if (komento.equals("erotus")) {
                erotus();
            } else if (komento.equals("tulo")) {
                tulo();
            }
        }

        statistiikka();
    }
    
    private void summa() {
        System.out.print("luku1: ");
        int luku1 = lukija.lueKokonaisluku();
        System.out.print("luku2: ");
        int luku2 = lukija.lueKokonaisluku();
        System.out.println("lukujen summa on "+(luku1+luku2));
        System.out.println("");
        laskuja++;
    }
    
    private void erotus(){
        System.out.print("luku1: ");
        int luku1 = lukija.lueKokonaisluku();
        System.out.print("luku2: ");
        int luku2 = lukija.lueKokonaisluku();
        System.out.println("lukujen erotus on "+ (luku1-luku2));
        System.out.println("");
        laskuja++;
    }
    
    private void tulo(){
        System.out.print("luku1: ");
        int luku1 = lukija.lueKokonaisluku();
        System.out.print("luku2: ");
        int luku2 = lukija.lueKokonaisluku();
        System.out.println("lukujen tulo on "+ (luku1*luku2));
        System.out.println("");
        laskuja++;
    }
    
    private void statistiikka(){
        System.out.println("Laskuja laskettiin "+laskuja);
    }
}
