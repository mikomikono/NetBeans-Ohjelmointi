
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Tervetuloa tikkupeliin!");

        Scanner lukija = new Scanner(System.in);
        Tekoaly tekoaly = new Tekoaly();

        Tikkupeli peli = new Tikkupeli(lukija, tekoaly); 
        tekoaly.luoHatut(peli.tikkuja());
        peli.ketaVastaan();

        while (true){
            
            while (peli.eiOleOhi()) {
                peli.pelaaKierros();
            }
            if (peli.pelaaja()==2&&peli.konettaVastaan()){
                System.out.println("Tekoäly häviää");
                tekoaly.opi(false);
            } else {
                System.out.println("Pelaaja "+peli.pelaaja()+", hävisit :/");
                tekoaly.opi(true);
            }
            System.out.print("Pelaa uudestaan (1 = kyllä, 0 = ei)? ");
            int uudestaan = Integer.parseInt(lukija.nextLine());
            if (uudestaan == 0){
                break;
            } else if (uudestaan == 1){
                peli.uusiPeli();
            }
        }
        System.out.println("Kiitos!");
    }
}
