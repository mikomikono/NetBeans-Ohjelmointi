import java.util.HashMap;
import java.util.Scanner;

public class Tehtava3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        HashMap<String, Integer> tilit = new HashMap<>();
        while (true){
            System.out.print("Syötä tilinumero tai tyhjä jos valmis: ");
            String tilinumero = lukija.nextLine();
            if (tilinumero.equals("")){
                break;
            }
            System.out.print("Syötä saldo: ");
            Integer saldo = Integer.parseInt(lukija.nextLine());
            tilit.put(tilinumero, saldo);
        }
        
        System.out.println("Tilit syötetty, yhteensä "+tilit.size()+".");
        System.out.println("");
        TilienKasittely tilienKasittely = new TilienKasittely(tilit);
        while (true){
            System.out.print("Komennot: \n" +
                "siirto - tee tilisiirto\n" +
                "tulosta - tulosta tilit\n" +
                "lopeta - lopeta\n" +
                "> ");
            String komento = lukija.nextLine();
            if (komento.equals("siirto")){
                System.out.print("Miltä tililtä siirretään: ");
                String mista = lukija.nextLine();
                System.out.print("Mille tilille siirretään: ");
                String mihin = lukija.nextLine();
                System.out.print("Paljonko? ");
                Integer paljon = Integer.parseInt(lukija.nextLine());
                tilienKasittely.siirra(mista, mihin, paljon);
            } else if (komento.equals("tulosta")){
                System.out.println("Tulostetaan tilit");
                tilienKasittely.tulostaTilit();
            } else if (komento.equals("lopeta")){
                break;
            } else {
                System.out.println("Tuntematon komento: "+komento);
            }
        }
        System.out.println("Kiitos!");
    }

}
