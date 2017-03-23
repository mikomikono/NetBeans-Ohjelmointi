
import java.util.ArrayList;
import java.util.List;



public class Paaohjelma {

    public static void main(String[] args) {
        List<String> nimet = new ArrayList<>();
        nimet.add("eka");
        nimet.add("toka");
        nimet.add("kolmas");

        System.out.println(palautaKoko(nimet));


    }

    // toteuta tänne staattinen luokkametodi palautaKoko, joka palauttaa parametrina 
    // saamansa lista-olion alkioiden lukumäärän
    public static int palautaKoko(List<String> lista){
        int luku=0;
        for (String nimi: lista){
            luku++;
        }
        return luku;
    }
}
