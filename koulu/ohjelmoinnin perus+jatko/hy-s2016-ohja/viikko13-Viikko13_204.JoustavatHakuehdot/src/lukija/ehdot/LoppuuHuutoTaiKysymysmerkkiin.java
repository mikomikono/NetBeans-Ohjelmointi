package lukija.ehdot;

public class LoppuuHuutoTaiKysymysmerkkiin implements Ehto {
    
    public LoppuuHuutoTaiKysymysmerkkiin(){
        
    }

    @Override
    public boolean toteutuu(String rivi) {
        if (rivi.isEmpty()){
            return false;
        }
        return rivi.charAt(rivi.length()-1)=='!'|rivi.charAt(rivi.length()-1)=='?';
    }
    
}
