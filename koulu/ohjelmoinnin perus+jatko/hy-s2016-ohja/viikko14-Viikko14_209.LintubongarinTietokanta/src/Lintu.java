public class Lintu {
    private String nimi;
    private String latinaNimi;

    public Lintu(String nimi, String latinaNimi) {
        this.nimi = nimi;
        this.latinaNimi = latinaNimi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public String getLatinanKielinenNimi(){
        return this.latinaNimi;
    }
    
    @Override
    public String toString(){
        return this.nimi+" ("+this.latinaNimi+")";
    }
}
