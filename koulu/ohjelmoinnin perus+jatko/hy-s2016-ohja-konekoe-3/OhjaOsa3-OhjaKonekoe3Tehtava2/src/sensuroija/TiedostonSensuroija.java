package sensuroija;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TiedostonSensuroija {
    private Scanner lukija;
    private FileWriter kirjoittaja;
    private String sensuroitava;

    public TiedostonSensuroija(String tiedostonNimi, String sensuroitava, String uusiTiedosto) {
        File tiedosto = new File(tiedostonNimi);
        try { 
            this.lukija = new Scanner(tiedosto);
            this.sensuroitava = sensuroitava;
            try {
                this.kirjoittaja = new FileWriter(uusiTiedosto);
            } catch (IOException ex) {
                System.out.println("Tiedostoa " + uusiTiedosto + "ei saatu luotua.");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Tiedostoa "+ tiedostonNimi + " ei löydy.");
        }
    }
    
    public void sensuroi(){
        if (lukija==null){
            return;
        }
        try {
            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                String sensuroituRivi = rivi;
                if (rivi.contains(sensuroitava)) {
                    sensuroituRivi = rivi.replace(sensuroitava, tahtia());
                }
                kirjoittaja.append(sensuroituRivi+"\n");
            }
            kirjoittaja.close();
        } catch (IOException ex) {
             System.out.println("Tiedostoon kirjoittaminen epäonnistui.");
        }
    }
    
    private String tahtia(){
        String tahdet = "";
        for (int i = 0; i < this.sensuroitava.length(); i++) {
            tahdet+="*";
        }
        return tahdet;
    }
}
