import java.util.ArrayList;

public class Kirjasto {
    private ArrayList<Kirja> kirjat;

    public Kirjasto(){
        this.kirjat=new ArrayList<>();
    }
    
    public void lisaaKirja(Kirja uusiKirja){
        kirjat.add(uusiKirja);
    }
    
    public void tulostaKirjat(){
        for (Kirja kirja:kirjat){
            System.out.println(kirja);
        }
    }
    
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja:kirjat){
//            if (kirja.nimeke().contains(nimeke)){
//                loydetyt.add(kirja);
            if (StringUtils.sisaltaa(kirja.nimeke(), nimeke)){
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja:kirjat){
//            if (kirja.julkaisija().contains(julkaisija)){
//                loydetyt.add(kirja);
            if (StringUtils.sisaltaa(kirja.julkaisija(), julkaisija)){
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        for (Kirja kirja:kirjat){
            if (kirja.julkaisuvuosi()==julkaisuvuosi){
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }
}
