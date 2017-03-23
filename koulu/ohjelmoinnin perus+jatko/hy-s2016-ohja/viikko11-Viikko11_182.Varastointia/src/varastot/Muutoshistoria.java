package varastot;

import java.util.ArrayList;
import java.util.Collections;

public class Muutoshistoria {
    private ArrayList<Double> historia;
    
    public Muutoshistoria(){
        historia= new ArrayList<>();
    }
    
    public void lisaa(double tilanne){
        historia.add(tilanne);
    }
    
    public void nollaa(){
        historia.removeAll(historia);
    }
    
    public double maxArvo(){
        if (this.historia.isEmpty()){
            return 0;
        }
//        ArrayList<Double> jarjestelty = this.historia;
//        Collections.sort(jarjestelty);
//        return jarjestelty.get(jarjestelty.size()-1);
        double suurin=this.historia.get(0);
        for (double d:historia){
            if (d>suurin){
                suurin=d;
            }
        }
        return suurin;
    }
    
    public double minArvo(){
        if (this.historia.isEmpty()){
            return 0;
        }
//        ArrayList<Double> jarjestelty = this.historia;
//        Collections.sort(jarjestelty);
//        return jarjestelty.get(0); //meni 4 ylimääräistä riviä molempiin kun tämä ei jostain syystä kelpaa??? America explain!!??
        double pienin=this.historia.get(0);
        for (double d:historia){
            if (d<pienin){
                pienin=d;
            }
        }
        return pienin;
    }
    
    public double keskiarvo(){
        if (this.historia.isEmpty()){
            return 0;
        }
        double summa=0;
        for (double d:historia){
            summa+=d;
        }
        return summa/historia.size();
    }
    
    public double suurinMuutos(){
        if (this.historia.isEmpty()|this.historia.size()==1){
            return 0;
        }
        double suurinMuutos=0;
        for (int i=0; i<historia.size()-1;i++){
            double muutos=historia.get(i)-historia.get(i+1);
            if (muutos<0){
                muutos=-1*muutos;
            }
            if(muutos>suurinMuutos){
                suurinMuutos=muutos;
            }
        }
        return suurinMuutos;
    }
    
    public double varianssi(){
        if (this.historia.isEmpty()|this.historia.size()==1){
            return 0;
        }
        double summa=0;
        double keskiarvo=keskiarvo();
        for (double d:historia){
            summa+=(d-keskiarvo)*(d-keskiarvo);
        }
        return summa/(historia.size()-1);
    }
    
    @Override
    public String toString(){
        return this.historia.toString();
    }
}
