
import java.util.HashMap;

public class Tietokanta {
    private HashMap<Lintu, Integer> linnut;
    
    public Tietokanta(){
        this.linnut = new HashMap<>();
    }
    
    public void lisaa(Lintu lintu){
        if (!this.linnut.containsKey(lintu)){
            this.linnut.put(lintu, 0);
        }
    }
    
    public boolean havaittu(String havainto){
        Lintu lintu = etsiLintu(havainto);
        if (lintu==null) {
            return false;
        } else  {
            int i = this.linnut.get(lintu);
            i++;
            this.linnut.replace(lintu, i);
            return true;
        }
    }
    
    public void tilasto(){
        for (Lintu lintu : this.linnut.keySet()){
            tulosta(lintu);
        }
    }
    
    public void nayta(String nimi){
        Lintu lintu = etsiLintu(nimi);
        if (lintu==null){
            System.out.println("Lintua ei löytynyt.");
        } else {
            tulosta(lintu);
        }
    }
    
    public Lintu etsiLintu(String nimi){
        Lintu lintu = null;
        for (Lintu l : this.linnut.keySet()){
            if (l.getNimi().equals(nimi)){
                lintu = l;
            }
            if (l.getLatinanKielinenNimi().equals(nimi)){
                lintu = l;
            }
        }
        return lintu;
    }
    
    public void tulosta(Lintu lintu){
        if (this.linnut.keySet().contains(lintu)){
            System.out.println(lintu+": "+this.linnut.get(lintu)+" havaintoa");
        }
    }
}
