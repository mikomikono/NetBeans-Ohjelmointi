
import java.util.ArrayList;
import java.util.OptionalDouble;

public class Sademaara {
    private ArrayList<Double> sademaarat;
    
    public Sademaara(){
        this.sademaarat=new ArrayList<>();
    }
    
    public void lisaa(double maara){
        this.sademaarat.add(maara);
    }
    
    public int koko(){
        return this.sademaarat.size();
    }
    
    public double keskiarvo(){
        double summa = 0.0;
        summa = this.sademaarat.stream().map((d) -> d).reduce(summa, (accumulator, _item) -> accumulator + _item);
        return summa/this.sademaarat.size();
    }
}
