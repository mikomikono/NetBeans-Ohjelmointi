
import java.util.Scanner;

public class Tehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int luku = lukija.nextInt();
        for (int i=1;i<=luku;i++){
            if (i==1|i==luku){
                kokoRivi(luku);
            } else {
                valiRivi(luku);
            }
        }

    }
    
    public static void kokoRivi(int maara){
        for (int i=0;i<maara;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static void valiRivi(int maara){
        for (int i=1;i<=maara;i++){
            if (i==1|i==maara){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
