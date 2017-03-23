package analyysi;

import java.io.File;
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        File tiedosto;
        Scanner tiedostonLukija;
        while (true) {
            System.out.println("Anna analysoitavan tiedoston nimi:");
            String tiedostonNimi = lukija.nextLine();
            try {
                tiedosto = new File(tiedostonNimi);
                tiedostonLukija = new Scanner(tiedosto);
                break;
            } catch (Exception e) {
                System.out.println("Tiedostoa "+tiedostonNimi+" ei löydy.\n");
            }
        }
        System.out.println("\nAnalysoidaan tiedostoa "+tiedosto.getName()+"\n");
        SanojenLaskija laskija = new SanojenLaskija(tiedostonLukija, tiedosto);
        System.out.println("Sanoja: "+laskija.laskeSanat());
        System.out.println("Uniikkeja: "+laskija.laskeUniikitSanat());
    }

}
