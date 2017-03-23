package maatilasimulaattori;

public class Maitosailio {
    private double tilavuus;
    private double saldo;
    
    public Maitosailio(){
        this.tilavuus=2000.0;
        this.saldo=0;
    }
    
    public Maitosailio(double tilavuus){
        this.tilavuus=tilavuus;
        this.saldo=0;
    }
    
    public double getTilavuus(){
        return this.tilavuus;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double paljonkoTilaaJaljella(){
        return this.tilavuus-this.saldo;
    }
    
    public void lisaaSailioon(double maara){
        this.saldo+=maara;
        if (this.saldo>this.tilavuus){
            this.saldo=this.tilavuus;
        }
    }
    
    public double otaSailiosta(double maara){
        if (maara < 0) {
            return 0.0;
        }
        if (maara > saldo) {
            double kaikkiMitaVoidaan = saldo;
            saldo = 0.0;
            return kaikkiMitaVoidaan;
        }

        saldo = saldo - maara;
        return maara;
    }
    
    @Override
    public String toString(){
        double x=Math.ceil(this.saldo);
        double y=Math.ceil(this.tilavuus);
        return x+"/"+y;
    }
}
