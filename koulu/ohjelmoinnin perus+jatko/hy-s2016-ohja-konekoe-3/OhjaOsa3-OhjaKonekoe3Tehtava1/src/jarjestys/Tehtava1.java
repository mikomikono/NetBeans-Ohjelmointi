package jarjestys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList<>();
        KirjaJarjestelija jarjestelija = new KirjaJarjestelija();
        
        while (true) {
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Syötä julkaisuvuosi: ");
            int vuosi = Integer.parseInt(lukija.nextLine());
            kirjat.add(new Kirja(nimi, vuosi));
        }
        
        System.out.println("\nKiitos!\n");
        
        System.out.print("Missä järjestyksessä kirjat tulostetaan?\n" +
                "  nimi -- nimen mukaan järjestettynä\n" +
                "  vuosi -- julkaisuvuoden mukaan järjestettynä\n" +
                "  molemmat -- nimen ja julkaisuvuoden mukaan järjestettynä\n" +
                "\n" +
                "> ");
        
        String komento = lukija.nextLine();
        if (komento.equals("nimi")) {
            kirjat = jarjestelija.aakkosittain(kirjat);
        } else if (komento.equals("vuosi")) {
            kirjat = jarjestelija.vuosittain(kirjat);
        } else {
            kirjat = jarjestelija.molemmat(kirjat);
        }
        
        System.out.println("\n" +
                "Kirjat järjestyksessä: ");
        
        for (Kirja kirja : kirjat) {
            System.out.println(kirja);
        }
    }

}
