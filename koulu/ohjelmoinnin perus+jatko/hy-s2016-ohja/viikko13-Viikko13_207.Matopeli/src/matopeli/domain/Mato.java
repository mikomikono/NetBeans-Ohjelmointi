package matopeli.domain;

import java.util.ArrayList;
import java.util.List;
import matopeli.Suunta;

public class Mato {
    private int x;
    private int y;
    private Suunta suunta;
    private List<Pala> palat;
    private int kasvetaan;
    
    public Mato(int alkuX, int alkuY, Suunta alkusuunta){
        this.x=alkuX;
        this.y=alkuY;
        this.suunta=alkusuunta;
        this.palat = new ArrayList<>();
        this.palat.add(new Pala(alkuX, alkuY));
        this.kasvetaan=2;
    }
    
    public Suunta getSuunta(){
        return this.suunta;
    }
    
    public void setSuunta(Suunta suunta){
        this.suunta=suunta;
    }
    
    public int getPituus(){
        return this.palat.size();
    }
    
    public List<Pala> getPalat(){
        return this.palat;
    }
    
    public void liiku(){
        if (this.suunta.equals(Suunta.VASEN)){
            this.x--;
        }
        if (this.suunta.equals(Suunta.OIKEA)){
            this.x++;
        }
        if (this.suunta.equals(Suunta.ALAS)){
            this.y++;
        }
        if (this.suunta.equals(Suunta.YLOS)){
            this.y--;
        }
        palat.add(new Pala(this.x, this.y));
        if (kasvetaan==0){
            palat.remove(0);
        } else {
            kasvetaan--;
        }
    }
    
    public void kasva(){
        if (getPituus()>2){
            kasvetaan++;
        }
    }
    
    public boolean osuu(Pala pala){
        for (Pala madonPalat : this.palat){
            if (madonPalat.osuu(pala)){
                return true;
            }
        }
        return false;
    }
    
    public boolean osuuItseensa(){
        for (Pala pala : this.palat){
            int osuu=0;
            for (Pala madonPalat : this.palat){
                if (madonPalat.osuu(pala)){
                    osuu++;
                }
            }
            if (osuu>1){
                return true;
            }
        }
        return false;
    }
}
