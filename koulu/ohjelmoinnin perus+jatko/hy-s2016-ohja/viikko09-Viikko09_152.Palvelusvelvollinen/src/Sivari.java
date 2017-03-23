public class Sivari implements Palvelusvelvollinen {
    private int tj;
    
    public Sivari(){
        tj=362;
    }
    
    @Override
    public void palvele(){
        if (tj>0){
            tj--;
        }
    }
    
    @Override
    public int getTJ(){
        return this.tj;
    }
}
