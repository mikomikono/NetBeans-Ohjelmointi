
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sademaara sademaara = new Sademaara();
        System.out.println("Anna sademääriä, lopeta luvulla 999999.");
        while (true){
            System.out.println("Anna sademäärä:");
            double maara = Double.parseDouble(lukija.nextLine());
            if (maara==999999){
                break;
            }
            if (maara>=0){
                sademaara.lisaa(maara);
            }
        }
        if (sademaara.koko()<1){
            System.out.println("Yhtään sademäärää ei syötetty.");
        } else {
            System.out.println("Sademäärien keskiavo on " + sademaara.keskiarvo() + ".");
        }
    }
}
