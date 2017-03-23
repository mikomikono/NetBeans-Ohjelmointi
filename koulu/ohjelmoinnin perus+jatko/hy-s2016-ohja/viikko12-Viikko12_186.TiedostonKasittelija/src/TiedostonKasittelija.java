
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedostonKasittelija {

    public ArrayList<String> lue(String tiedosto) throws FileNotFoundException {
        ArrayList<String> rivit = new ArrayList<>();
        File luettava = new File(tiedosto);
        Scanner lukija = new Scanner(luettava);
        while (lukija.hasNextLine()){
            String rivi = lukija.nextLine();
            rivit.add(rivi);
        }
        return rivit;
    }

    public void tallenna(String tiedosto, String teksti) throws IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto, true);
        kirjoittaja.write(teksti);
        kirjoittaja.close();
    }

    public void tallenna(String tiedosto, ArrayList<String> tekstit) throws IOException {
        FileWriter kirjoittaja = new FileWriter(tiedosto);
        for (int i=0; i<tekstit.size(); i++){
            kirjoittaja.write(tekstit.get(i)+"\n");
        }
        kirjoittaja.close();
    }
}
