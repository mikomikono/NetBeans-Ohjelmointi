
import java.util.HashMap;


public class TilienKasittely {
    private HashMap<String, Integer> tilit;
    
    public TilienKasittely(HashMap tilit){
        this.tilit=tilit;
    }
    
    public void siirra(String mista, String mihin, Integer paljonko){
        if (tilit.containsKey(mista)&&tilit.containsKey(mihin)){
            tilit.replace(mista, tilit.get(mista)-paljonko);
            tilit.replace(mihin, tilit.get(mihin)+paljonko);
        }
    }
    
    public void tulostaTilit(){
        for (String avain : this.tilit.keySet()){
            System.out.println("  "+avain+" (saldo: "+tilit.get(avain)+")");
        }
    }
    
}
