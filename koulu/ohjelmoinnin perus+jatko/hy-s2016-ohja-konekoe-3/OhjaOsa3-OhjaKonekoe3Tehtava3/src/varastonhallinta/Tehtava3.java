package varastonhallinta;

import java.util.Scanner;

public class Tehtava3 {

    public static void main(String[] args) {
        System.out.println("Varastonhallinta!\n");
        
        Scanner lukija = new Scanner(System.in);
        VarastojenHallinta hallinta = new VarastojenHallinta();

        System.out.println("Komennot: \n" +
                "  lisaa (varasto) (esine) -- lisää esineen varastoon\n" +
                "  listaa (varasto) -- listaa kaikki annetun varaston esineet\n" +
                "  hae (varasto) (esine) -- kertoo onko varastossa haettua esinettä\n" +
                "  poista (varasto) (esine) -- poistaa yhden esineen annetusta varastosta\n" +
                "  lopeta -- lopettaa ohjelman suorituksen\n");
        
        while (true) {
            System.out.print("\n" +
                    "Syötä komento: \n" +
                    "> ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")){
                break;
            }
            hallinta.tee(komento);
        }
        
        System.out.println("\nKiitos!");
    }

}
