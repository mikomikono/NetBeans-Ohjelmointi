import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
        String nimi=lukija.nextLine();
        while (true){
            if (nimi.isEmpty()){
                break;
            }
            System.out.print("Syötä kirjan pienin kohdeikä: ");
            int kohdeIka=Integer.parseInt(lukija.nextLine());
            Kirja kirja = new Kirja(nimi, kohdeIka);
            kirjat.add(kirja);
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            nimi=lukija.nextLine();
        }
        Collections.sort(kirjat);
        System.out.println("\n"+
                "Yhteensä "+ kirjat.size()+" kirjaa.");
        System.out.println("Kirjat:");
        for (Kirja kirja : kirjat){
            System.out.println(kirja);
        }

    }

}
