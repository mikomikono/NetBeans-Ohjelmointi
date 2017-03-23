import java.util.ArrayList;

public class Ostoslista {
    ArrayList<String> tuotteet = new ArrayList<>();

    public Ostoslista() {
    }
    
    public void lisaa(String tuote) {
        tuotteet.add(tuote);
    }
    
    public int kappalemaara(String tuote) {
        int maara=0;
        for (String ostos:tuotteet){
            if (ostos.equals(tuote)) {
                maara++;
            }
        }
        return maara;
    }
    
    public void poista(String tuote){
        for (String ostos: tuotteet) {
            if (ostos.equals(tuote)){
                tuotteet.remove(ostos);
                break;
            }
        }
    }
    
    public void tulosta(){
        for (String tuote : tuotteet){
            System.out.println(tuote);
        }
    }
}
