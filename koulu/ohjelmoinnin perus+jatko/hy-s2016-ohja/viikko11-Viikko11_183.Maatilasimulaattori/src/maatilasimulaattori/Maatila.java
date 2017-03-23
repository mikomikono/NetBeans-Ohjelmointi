package maatilasimulaattori;

import java.util.ArrayList;

public class Maatila implements Eleleva {
    private String omistaja;
    private ArrayList<Lehma> lehmat;
    private Navetta navetta;
    
    public Maatila(String omistaja, Navetta navetta){
        this.omistaja=omistaja;
        this.navetta=navetta;
        this.lehmat=new ArrayList<>();
    }
    
    public void lisaaLehma(Lehma lehma){
        lehmat.add(lehma);
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti robotti){
        this.navetta.asennaLypsyrobotti(robotti);
    }
    
    public void hoidaLehmat(){
        this.navetta.hoida(lehmat);
    }
    
    public String getOmistaja(){
        return this.omistaja;
    }
    
    public String getLehmat(){
        if (lehmat.isEmpty()){
            return "Ei lehmiä.";
        }
        String lehmia="Lehmät:";
        for (Lehma lehma:lehmat){
            lehmia+="\n        "+lehma.toString();
        }
        return lehmia;
    }
    
    @Override
    public String toString(){
        return "Maatilan omistaja: "+this.omistaja+"\n"+
                "Navetan maitosäilio: "+navetta.toString()+"\n"+
                getLehmat();
    }

    @Override
    public void eleleTunti() {
        for (Lehma lehma:lehmat){
            lehma.eleleTunti();
        }
    }
}
