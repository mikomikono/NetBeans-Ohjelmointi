
import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
        System.out.println("Syötä lukuja, nolla tai negatiivinen lopettaa lukemisen.");
        while(true){
            int luku= lukija.nextInt();
            if (luku<=0){
                break;
            } else {
                luvut.add(luku);
            }
        }
        if (luvut.size()<3){
            System.out.println("Ei tarpeeksi lukuja.");
        } else {
            int kolmenSumma=0;
            for (int i=1;i<=3;i++){
                kolmenSumma+=luvut.get(luvut.size()-i);
            }
            double keskiarvo=1.0*kolmenSumma/3;
            System.out.println("Keskiarvo: "+keskiarvo);
        }
    }

}
