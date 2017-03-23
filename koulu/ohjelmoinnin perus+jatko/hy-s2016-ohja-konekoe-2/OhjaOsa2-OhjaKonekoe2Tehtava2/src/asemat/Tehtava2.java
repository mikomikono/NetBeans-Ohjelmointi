package asemat;

import java.util.HashMap;
import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        HashMap<String, Mittauspiste> mittauspisteet = new HashMap<>();
        while (true){
            System.out.print("Syötä mittauspisteen nimi, tyhjä lopettaa: ");
            String piste = lukija.nextLine();
            if (piste.isEmpty()){
                break;
            } else {
                System.out.print("Syötä mittaus: ");
                int mittaus = Integer.parseInt(lukija.nextLine());
                if (mittauspisteet.containsKey(piste)){
                    mittauspisteet.get(piste).lisaaMittaus(mittaus);
                } else {
                    Mittauspiste mittauspiste = new Mittauspiste(piste);
                    mittauspiste.lisaaMittaus(mittaus);
                    mittauspisteet.put(piste, mittauspiste);
                }
            }
        }
        System.out.println("\nKiitos!\n");
        System.out.println("Mittaustulokset");
        for (String piste : mittauspisteet.keySet()){
            System.out.println(mittauspisteet.get(piste));
        }
    }

}
