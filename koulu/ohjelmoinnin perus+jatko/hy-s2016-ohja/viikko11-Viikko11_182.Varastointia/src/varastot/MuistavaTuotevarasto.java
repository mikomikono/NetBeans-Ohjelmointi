package varastot;

public class MuistavaTuotevarasto extends Tuotevarasto {
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkusaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkusaldo);
        this.muutoshistoria=new Muutoshistoria();
        this.muutoshistoria.lisaa(alkusaldo);
    }
    
    public String historia(){
        return this.muutoshistoria.toString();
    }
    
    @Override
    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
    }
    
    @Override
    public double otaVarastosta(double maara){
        double otettu=super.otaVarastosta(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
        return otettu;
    }
    
    public void tulostaAnalyysi(){
        System.out.println("Tuote: "+super.getNimi()+"\n" +
                "Historia: "+this.muutoshistoria.toString()+"\n" +
                "Suurin tuotemäärä: "+this.muutoshistoria.maxArvo()+"\n" +
                "Pienin tuotemäärä: "+this.muutoshistoria.minArvo()+"\n" +
                "Keskiarvo: "+this.muutoshistoria.keskiarvo()+"\n" +
                "Suurin muutos: "+this.muutoshistoria.suurinMuutos()+"\n" +
                "Varianssi: "+this.muutoshistoria.varianssi());
    }
    
}
