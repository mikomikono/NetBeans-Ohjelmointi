package laatikot;

import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino){
        this.maksimipaino=maksimipaino;
        this.tavarat=new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        int painoa=0;
        for (Tavara pakattu:tavarat){
            painoa+=pakattu.getPaino();
        }
        if(painoa+tavara.getPaino()<=this.maksimipaino){
            tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (Tavara pakattu:tavarat){
            if (pakattu.equals(tavara)){
                return true;
            }
        }
        return false;
    }
    
}
