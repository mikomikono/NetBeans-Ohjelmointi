package maatilasimulaattori;

import java.util.Random;

public class Lehma implements Lypsava, Eleleva{
    private String nimi;
    private double tilavuus;
    private double maara;
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Lehma(){
        this.nimi="Matti";
        this.tilavuus=15.0+new Random().nextInt(26);
        this.maara=0;
    }
    
    public Lehma(String nimi){
        this.nimi=nimi;
        this.tilavuus=15.0+new Random().nextInt(26);
        this.maara=0;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public double getTilavuus(){
        return this.tilavuus;
    }
    
    public double getMaara(){
        return this.maara;
    }
    
    @Override
    public String toString(){
        double x=Math.ceil(this.maara);
        double y=Math.ceil(this.tilavuus);
        return this.nimi+" "+x+"/"+y;
    }

    @Override
    public double lypsa() {
        double a=this.maara;
        this.maara=0;
        return a;
    }

    @Override
    public void eleleTunti() {
        this.maara+=1+new Random().nextDouble();
        if (this.maara>this.tilavuus){
            this.maara=this.tilavuus;
        }
    }
}
