package muuttaminen.domain;

import java.util.ArrayList;

public class Muuttolaatikko implements Tavara {
    private int maksimitilavuus;
    private ArrayList<Tavara> tavarat;
    
    public Muuttolaatikko(int maksimitilavuus){
        this.maksimitilavuus=maksimitilavuus;
        this.tavarat=new ArrayList<>();
    }
    
    public boolean lisaaTavara(Tavara tavara){
        if (getTilavuus()+tavara.getTilavuus()<=this.maksimitilavuus){
            tavarat.add(tavara);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getTilavuus() {
        int yhteisTilavuus=0;
        for (Tavara tavara : tavarat){
            yhteisTilavuus+=tavara.getTilavuus();
        }
        return yhteisTilavuus;
    }
    
    @Override
    public String toString(){
        String tulostus="";
        for (Tavara tavara : this.tavarat){
            tulostus+=tavara+" ";
        }
        return tulostus;
    }
}
