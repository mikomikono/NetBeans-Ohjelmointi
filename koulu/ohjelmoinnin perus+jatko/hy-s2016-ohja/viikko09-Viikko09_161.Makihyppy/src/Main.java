import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Makihyppaaja> hyppaajat = new ArrayList<>();
        System.out.println("Kumpulan mäkiviikot\n" +
            "\n" +
            "Syötä kilpailun osallistujat yksi kerrallaan, tyhjällä merkkijonolla siirtyy hyppyvaiheeseen.");
        while (true){
            System.out.print("  Osallistujan nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()){
                break;
            } else {
                hyppaajat.add(new Makihyppaaja(nimi));
            }
        }
        System.out.println("");
        System.out.println("Kilpailu alkaa!\n" +
            "");
        int kierros=1;
        while (true){
            System.out.print("Kirjoita \"hyppaa\" niin hypätään, muuten lopetetaan: ");
            String komento = lukija.nextLine();
            if (!komento.equals("hyppaa")){
                break;
            } else {
                System.out.println("");
                System.out.println(kierros+". kierros\n" +
                    "\n" +
                    "Hyppyjärjestys:");
                int i=1;
                for (Makihyppaaja hyppaaja:hyppaajat){
                    System.out.println("  "+i+". "+ hyppaaja);
                    hyppaaja.hyppaa();
                    i++;
                }
                System.out.println("\n" +
                        "Kierroksen "+kierros+" tulokset");
                for (Makihyppaaja hyppaaja:hyppaajat){
                    System.out.println("  "+hyppaaja.getNimi()+"\n" +
                        "    pituus: "+hyppaaja.hypynPituus(kierros-1)+"\n" +
                        "    tuomaripisteet: "+hyppaaja.hypynPisteet(kierros-1));
                    System.out.println("");
                }
                Collections.sort(hyppaajat, new JarjestaHyppaajatPisteidenMukaan());
                kierros++;
            }
        }
        System.out.println("Kiitos!\n" +
            "\n" +
            "Kilpailun lopputulokset:\n" +
            "Sija    Nimi\n");
        int sija=1;
        for (int i=0;i<hyppaajat.size();i++){
            Makihyppaaja hyppaaja=hyppaajat.get(hyppaajat.size()-sija);
            System.out.print(sija+"       "+hyppaaja.getNimi()+" ("+hyppaaja.getPisteet()+" pistettä)\n" +
            "          hyppyjen pituudet: ");
            System.out.print(hyppaaja.hypynPituus(0));
            if (kierros>2){
                for (int x=1;x<kierros-1;x++){
                    System.out.print(", "+hyppaaja.hypynPituus(x));
                }
            }
            System.out.println("");
            sija++;
        }
    }
}
