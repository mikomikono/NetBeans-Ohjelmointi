
import java.util.ArrayList;
import java.util.List;

public class SummaSummarum {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(0);
        lista.add(7);
        lista.add(0);
        lista.add(5);
        lista.add(4);
        lista.add(1);
        lista.add(0);
        lista.add(0);
        lista.add(6);

        List<Integer> summat = summaSummarum(lista);
        for (int luku : summat) {
            System.out.println(luku);
        }
    }

    public static List<Integer> summaSummarum(List<Integer> luvut) {
        // toteuta metodin toiminnallisuus tänne
        ArrayList<Integer> summat = new ArrayList<>();
        Integer summa=0;
        for (int i=0;i<luvut.size();i++){
            int x = luvut.get(i);
            if (x==0){
                if (summa!=0){
                    summat.add(summa);
                    summa=0;
                }
                if (luvut.get(i+1)==0){
                    while (i+2<luvut.size()&&luvut.get(i+2)!=0){
                        luvut.remove(i+2);
                    }
                    i++;
                }
            }
            summa+=x;
        }
        return summat;
    }
}
