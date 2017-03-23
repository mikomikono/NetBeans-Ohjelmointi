public class Asevelvollinen implements Palvelusvelvollinen {
    private int tj;
    
    public Asevelvollinen(int tj){
        this.tj=tj;
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
