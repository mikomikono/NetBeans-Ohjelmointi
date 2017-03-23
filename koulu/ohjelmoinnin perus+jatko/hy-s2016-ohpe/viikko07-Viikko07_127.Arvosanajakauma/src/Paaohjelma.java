
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Koepisteet ohpe = new Koepisteet();
        System.out.println("Syötä koepisteet, -1 lopettaa:");
        while (true){
            int arvosana=lukija.nextInt();
            if (arvosana==-1){
                break;
            }
            if (arvosana>=0&&arvosana<=60){
                ohpe.lisaaTulos(arvosana);
            }

        }
        
        ohpe.tulostaJakauma();
    }
}
