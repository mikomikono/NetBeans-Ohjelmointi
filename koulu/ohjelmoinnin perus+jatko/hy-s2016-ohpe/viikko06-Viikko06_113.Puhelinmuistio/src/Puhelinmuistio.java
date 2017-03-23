import java.util.ArrayList;

public class Puhelinmuistio {
    private ArrayList<Henkilo> puhelinmuistio;
    
    public Puhelinmuistio(){
        this.puhelinmuistio= new ArrayList<>();
    }
    
    public void lisaa(String nimi, String numero){
        Henkilo henkilo =  new Henkilo(nimi, numero);
        puhelinmuistio.add(henkilo);
    }
    
    public String haeNumero(String nimi){
        for (Henkilo ihminen:puhelinmuistio){
            if (ihminen.haeNimi().equals(nimi)){
                return ihminen.haeNumero();
            }
        }
        return "numero ei tiedossa";
    }
    
    public void tulostaKaikki(){
        for (Henkilo henkilo:puhelinmuistio){
            System.out.println(henkilo);
        }
    }
}
