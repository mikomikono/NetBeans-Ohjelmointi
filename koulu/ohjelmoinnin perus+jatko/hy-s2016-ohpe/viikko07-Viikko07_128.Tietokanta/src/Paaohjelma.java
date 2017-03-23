import java.util.Scanner;

public class Paaohjelma {

    // tee ohjelmaasi VAIN YKSI Scanner-olio
    // jos joudut käyttämään Scanneria muualta kuin luontipaikasta, välitä se parametrina

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Tietokanta bongaus = new Tietokanta(lukija);
        while (true){
            System.out.print("? ");
            String komento=lukija.nextLine();
            if (komento.equals("Lisaa")){
                bongaus.lisaa();
            }
            if (komento.equals("Havainto")){
                bongaus.havainto();
            }
            if (komento.equals("Tilasto")){
                bongaus.tilasto();
            }
            if (komento.equals("Nayta")){
                bongaus.nayta();
            }
            if (komento.equals("Lopeta")){
                break;
            }
        }
    }

}
