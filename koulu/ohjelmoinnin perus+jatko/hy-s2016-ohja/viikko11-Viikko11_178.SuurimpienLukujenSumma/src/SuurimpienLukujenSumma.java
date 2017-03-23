
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuurimpienLukujenSumma {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä

        List<Integer> luvut1 = new ArrayList<>();
        List<Integer> luvut2 = new ArrayList<>();
        List<Integer> luvut3 = new ArrayList<>();
        luvut1.add(7);
        luvut1.add(2);
        luvut1.add(9);

        luvut2.add(11);
        luvut2.add(12);
        luvut2.add(5);
        
        luvut3.add(27);
        luvut3.add(5);
        luvut3.add(100);
        luvut3.add(18);

        List<List<Integer>> listat = new ArrayList<>();
        listat.add(luvut1);
        listat.add(luvut2);
        listat.add(luvut3);

        System.out.println(suurimpienLukujenSumma(listat)); // tulostaa 21
    }

    public static int suurimpienLukujenSumma(List<List<Integer>> lukulistat) {
        // toteuta metodin toiminnallisuus tänne
        int summa=0;
        for (List<Integer> lista:lukulistat){
            Collections.sort(lista);
            summa+=lista.get(lista.size()-1);
        }
        return summa;
    }
}
