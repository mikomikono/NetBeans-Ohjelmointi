
import java.util.Scanner;

public class EipasJuupas {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Toteuta tänne tehtävä "Eipäs Juupas"
        System.out.println("Anna merkkijono");
        String jono1 = lukija.nextLine();
        System.out.println("Anna toinen merkkijono");
        String jono2 = lukija.nextLine();
        if (jono1.equals(jono2)){
            System.out.println("Olipas!");
            System.out.println("No eipäs ollut!");
            System.out.println("Juupas!");
        } else {
            System.out.println("Eipäs ollut!");
            System.out.println("Juupas!");
            System.out.println("Eipäs!");
        }

    }
}
