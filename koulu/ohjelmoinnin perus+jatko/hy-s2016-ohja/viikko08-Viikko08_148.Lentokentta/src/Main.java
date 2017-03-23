import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        Scanner lukija=new Scanner(System.in);
        Lentokentta lentokentta=new Lentokentta(lukija);

        System.out.println("Lentokentän hallinta\n" +
            "--------------------\n");
        while (true){
            System.out.print("Valitse toiminto:\n" +
                "[1] Lisää lentokone\n" +
                "[2] Lisää lento\n" +
                "[x] Poistu hallintamoodista\n" +
                "> ");
            String toiminto =lukija.nextLine();
            if (toiminto.equals("1")){
                lentokentta.lisaaKone();
            }
            if (toiminto.equals("2")){
                lentokentta.lisaaLento();
            }
            if (toiminto.equals("x")){
                break;
            }
        }
        
        System.out.println("");
        System.out.println("Lentopalvelu\n" +
            "------------\n" +
            "");
        while (true){
            System.out.println("Valitse toiminto:\n" +
                "[1] Tulosta lentokoneet\n" +
                "[2] Tulosta lennot\n" +
                "[3] Tulosta lentokoneen tiedot\n" +
                "[x] Lopeta");
            String komento= lukija.nextLine();
            if (komento.equals("1")){
                lentokentta.tulostaKoneet();
            }
            if (komento.equals("2")){
                lentokentta.tulostaLennot();
            }
            if (komento.equals("3")){
                lentokentta.tulostaKone();
            }
            if (komento.equals("x")){
                break;
            }
        }
    }
}
