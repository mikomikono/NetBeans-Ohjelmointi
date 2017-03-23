package sensuroija;

import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna luettavan tiedoston nimi: ");
        String tiedostonimi = lukija.nextLine();
        System.out.print("Anna sensuroitava sana: ");
        String sensuroitava = lukija.nextLine();
        System.out.print("Anna tiedosto, johon sensuroitu teksti kirjoitetaan: ");
        String uusiTiedosto = lukija.nextLine();
        
        TiedostonSensuroija sensuroija = new TiedostonSensuroija(tiedostonimi, sensuroitava, uusiTiedosto);
        sensuroija.sensuroi();
    }
}
