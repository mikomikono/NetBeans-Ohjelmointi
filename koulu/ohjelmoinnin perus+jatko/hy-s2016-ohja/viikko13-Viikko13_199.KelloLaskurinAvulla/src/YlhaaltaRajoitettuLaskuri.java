public class YlhaaltaRajoitettuLaskuri {
    private int arvo;
    private int ylaraja;
    
    public YlhaaltaRajoitettuLaskuri(int ylaraja){
        this.arvo=0;
        this.ylaraja=ylaraja;
    }
    
    public void asetaArvo(int arvo){
        if (arvo>=0&&arvo<=this.ylaraja){
            this.arvo=arvo;
        }
    }
    
    public void seuraava(){
        this.arvo++;
        if (this.arvo>this.ylaraja){
            this.arvo=0;
        }
    }
    
    public int arvo(){
        return this.arvo;
    }
    
    @Override
    public String toString(){
        if (this.arvo<10){
            return "0"+this.arvo;
        }
        return ""+this.arvo;
    }
}
