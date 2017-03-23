package siirrettava;

import java.util.ArrayList;
import java.util.List;

public class Lauma implements Siirrettava {
    private List<Siirrettava> lauma;
    
    public Lauma(){
        this.lauma = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava){
        this.lauma.add(siirrettava);
    }

    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava siirrettava : lauma){
            siirrettava.siirra(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String toString = "";
        for (Siirrettava siirrettava : lauma){
            toString+=siirrettava+"\n";
        }
        return toString;
    }
    
}
