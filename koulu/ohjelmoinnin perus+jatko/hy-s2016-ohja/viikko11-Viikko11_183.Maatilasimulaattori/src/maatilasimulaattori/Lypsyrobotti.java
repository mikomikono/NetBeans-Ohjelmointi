package maatilasimulaattori;

public class Lypsyrobotti {
    private Maitosailio sailio;
    
    public Lypsyrobotti(){
        
    }
    
    public Maitosailio getMaitosailio(){
        return this.sailio;
    }
    
    public void setMaitosailio(Maitosailio maitosailio){
        this.sailio=maitosailio;
    }
    
    public void lypsa(Lypsava lypsava){
        if (this.sailio == null){
            throw new IllegalStateException("Maitosäiliötä ei ole asennettu");
        }
        double lypsetty=lypsava.lypsa();
        this.sailio.lisaaSailioon(lypsetty);
    }
}
