
import java.util.Scanner;

public class Paaohjelma {


    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Tietokanta tietokanta = new Tietokanta();
        while (true){
            System.out.print("? ");
            String komento = lukija.nextLine();
            if (komento.equals("Lopeta")){
                break;
            } else if(komento.equals("Lisaa")) {
                System.out.print("Nimi: ");
                String nimi = lukija.nextLine();
                System.out.print("Latinankielinen nimi: ");
                String latinanimi = lukija.nextLine();
                Lintu lintu = new Lintu(nimi, latinanimi);
                tietokanta.lisaa(lintu);
            } else if(komento.equals("Havainto")){
                System.out.print("Mikä havaittu? ");
                String havainto = lukija.nextLine();
                if (tietokanta.havaittu(havainto)==false){
                    System.out.println("Ei ole lintu!");
                }
            } else if (komento.equals("Tilasto")){
                tietokanta.tilasto();
            } else if (komento.equals("Nayta")){
                System.out.print("Mikä? ");
                String nimi = lukija.nextLine();
                tietokanta.nayta(nimi);
            } else {
                System.out.println("Epäpätevä komento.");
            }
        }
    }

}
