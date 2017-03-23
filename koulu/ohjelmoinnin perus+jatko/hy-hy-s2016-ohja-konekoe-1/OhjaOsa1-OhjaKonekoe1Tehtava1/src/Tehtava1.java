
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Metrejä: ");
        int luku = Integer.parseInt(lukija.nextLine());
        if (luku<0){
            System.out.println("Mitta oli negatiivinen, ei muunnoksia.");
        } else {
            double virsta = 1.0*luku/1066.80;
            double peninkulma = 1.0*luku/10000;
            double poronkusema = 1.0*luku/7500;
            System.out.println("Muunnos virstoiksi: " +virsta+ "\n" +
                    "Muunnos peninkulmiksi: "+ peninkulma+"\n" +
                    "Muunnos poronkusemiksi: "+poronkusema);
        }
    }

}
