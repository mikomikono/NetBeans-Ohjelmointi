
public class Lintu {

    private String nimi;
    private String latinankielinenNimi;
    private int rengastusvuosi;

    public Lintu(String nimi, String latinankielinenNimi, int rengastusvuosi) {
        this.nimi = nimi;
        this.latinankielinenNimi = latinankielinenNimi;
        this.rengastusvuosi = rengastusvuosi;
    }
    
    @Override
    public boolean equals(Object t){
        if (t == null) {
            return false;
        }
        if (this.getClass() != t.getClass()) {
            return false;
        }
        Lintu lintu = (Lintu) t;
        if (this.latinankielinenNimi.equals(lintu.latinankielinenNimi)&&this.rengastusvuosi==lintu.rengastusvuosi){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public int hashCode(){
        return this.latinankielinenNimi.hashCode()+this.rengastusvuosi;
    }


    @Override
    public String toString() {
        return this.latinankielinenNimi + " (" + this.rengastusvuosi + ")";
    }
}
