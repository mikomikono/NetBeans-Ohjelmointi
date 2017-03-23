
import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(1);
        luvut.add(2);
        luvut.add(3);
        luvut.add(3);
        luvut.add(4);
        luvut.add(5);
        luvut.add(5);
        luvut.add(5);

        System.out.println("Yleisin luku: " + yleisinLuku(luvut));
    }

    public static int yleisinLuku(ArrayList<Integer> luvut) {
        int yleisin=0;
        int montako=0;
        for (int luku : luvut){
            int esiintymiset=0;
            for (int luku2:luvut){
                if (luku==luku2){
                    esiintymiset++;
                }
            }
            if (esiintymiset>montako){
                yleisin=luku;
                montako=esiintymiset;
            }
        }
        return yleisin;
    }

}
