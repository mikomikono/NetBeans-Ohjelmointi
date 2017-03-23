package maatilasimulaattori;

import java.util.Collection;

public class Navetta {
    private Maitosailio sailio;
    private Lypsyrobotti robotti;
    
    public Navetta(Maitosailio maitosailio){
        this.sailio=maitosailio;
    }
    
    public Maitosailio getMaitosailio(){
        return this.sailio;
    }
    
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti){
        this.robotti=lypsyrobotti;
        robotti.setMaitosailio(this.sailio);
    }
    
    public void hoida(Lehma lehma){
        if (this.robotti == null){
            throw new IllegalStateException("Robottia ei ole asennettu");
        }
        this.robotti.lypsa(lehma);
    }
    
    public void hoida(Collection<Lehma> lehmat){
        if (this.robotti == null){
            throw new IllegalStateException("Robottia ei ole asennettu");
        }
        for (Lehma lehma : lehmat){
            this.robotti.lypsa(lehma);
        }
    }
    
    @Override
    public String toString(){
        return this.sailio.toString();
    }
}
