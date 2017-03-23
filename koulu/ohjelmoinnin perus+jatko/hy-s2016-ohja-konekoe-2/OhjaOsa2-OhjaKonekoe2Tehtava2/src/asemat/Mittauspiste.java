package asemat;

import java.util.ArrayList;

public class Mittauspiste {
    private String nimi;
    private int mittausKertoja;
    private ArrayList<Integer> mittaukset;
    
    public Mittauspiste(String nimi){
        this.nimi=nimi;
        this.mittausKertoja=0;
        this.mittaukset=new ArrayList<>();
    }
    
    public void lisaaMittaus(int mittaus){
        this.mittausKertoja++;
        this.mittaukset.add(mittaus);
    }
    
    public int getMittausKerrat(){
        return this.mittausKertoja;
    }
    
    public int getMittaukset(){
        int mittausSumma=0;
        for (int mittaus:this.mittaukset){
            mittausSumma+=mittaus;
        }
        return mittausSumma;
    }
    
    public double getKeskimittaus(){
        return 1.0*getMittaukset()/this.mittausKertoja;
    }
    
    @Override
    public String toString(){
        return "  Piste "+this.nimi+", keskimittaus "+getKeskimittaus()+", mittauksia: "+this.mittausKertoja;
    }
}
