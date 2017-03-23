public class Kurssisuoritus {
    private String kurssiNimi;
    private int opintopisteet;
    private int arvosana;
    
    public Kurssisuoritus(String nimi, int arvosana, int op){
        this.kurssiNimi=nimi;
        this.opintopisteet=op;
        this.arvosana=arvosana;
    }
    
    public String getKurssi(){
        return this.kurssiNimi;
    }
    
    public int getOpintopisteet(){
        return this.opintopisteet;
    }
    
    public int getArvosana(){
        return this.arvosana;
    }
    
    public void setArvosana(int uusiArvosana){
        this.arvosana=uusiArvosana;
    }
    
    @Override
    public String toString(){
        return this.kurssiNimi + " "+ this.opintopisteet +" op, arvosana: "+this.arvosana;
    }
}
