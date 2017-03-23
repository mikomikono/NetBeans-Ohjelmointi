import java.util.ArrayList;

public class Matkalaukku {
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    
    public Matkalaukku(int maksimipaino){
        this.maksimipaino=maksimipaino;
        this.tavarat=new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara){
        if (yhteispaino()+tavara.getPaino()<=this.maksimipaino) {
            this.tavarat.add(tavara);
        }
    }
    
    public int yhteispaino(){
        int painoa=0;
        for (Tavara tavara:tavarat){
            painoa+=tavara.getPaino();
        }
        return painoa;
    }
    
    public void tulostaTavarat(){
        for (Tavara tavara: tavarat){
            System.out.println(tavara);
        }
    }
    
    public Tavara raskainTavara(){
        Tavara painavin=new Tavara("tavara", 0);
        for (Tavara tavara: tavarat){
            if (tavara.getPaino()>painavin.getPaino()){
                painavin=tavara;
            }
        }
        if (painavin.getPaino()==0){
            return null;
        } else {
            return painavin;
        }
    }
    
    @Override
    public String toString(){
        if (this.tavarat.isEmpty()){
            return "ei tavaroita ("+yhteispaino()+" kg)";
        } else if (this.tavarat.size()==1){
            return "1 tavara ("+yhteispaino()+" kg)";
        } else {
            return this.tavarat.size()+" tavaraa ("+yhteispaino()+" kg)";
        }
    }
}
