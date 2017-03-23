import java.util.ArrayList;

public class Lastiruuma {
    private int maksimipaino;
    private ArrayList<Matkalaukku> matkatavarat;
    
    public Lastiruuma(int maksimipaino){
        this.maksimipaino=maksimipaino;
        this.matkatavarat=new ArrayList<>();
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku){
        if (ruumanPaino()+laukku.yhteispaino()<=this.maksimipaino) {
            this.matkatavarat.add(laukku);
        }
    }
    
    public int ruumanPaino(){
        int painoa=0;
        for (Matkalaukku laukku:matkatavarat){
            painoa+=laukku.yhteispaino();
        }
        return painoa;
    }
    
    public void tulostaTavarat(){
        for(Matkalaukku laukku:matkatavarat){
            laukku.tulostaTavarat();
        }
    }
    
    @Override
    public String toString(){
        if (this.matkatavarat.isEmpty()){
            return "ei matkalaukkuja ("+ruumanPaino()+" kg)";
        } else if (this.matkatavarat.size()==1){
            return "1 matkalaukku ("+ruumanPaino()+" kg)";
        } else {
            return this.matkatavarat.size()+" matkalaukkua ("+ruumanPaino()+" kg)";
        }
    }
}
