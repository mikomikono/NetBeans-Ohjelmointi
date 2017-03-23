public class Koepisteet {
    private int vitosia;
    private int nelosia;
    private int kolmosia;
    private int kakkosia;
    private int ykkosia;
    private int hylatty;
    private int yhteensa;
    private int hyvaksytyt;
    
    public Koepisteet(){

    }
    
    public void lisaaTulos(int koetulos){
        if (koetulos>=50){
            this.vitosia++;
        }
        if (koetulos>=45&&koetulos<=49){
            this.nelosia++;
        }
        if (koetulos>=40&&koetulos<=44){
            this.kolmosia++;
        }
        if (koetulos>=35&&koetulos<=39){
            this.kakkosia++;
        }
        if (koetulos>=30&&koetulos<=34){
            this.ykkosia++;
        }
        if (koetulos>=0&&koetulos<=29){
            this.hylatty++;
        }

        if (koetulos>=30){
            this.hyvaksytyt++;
        }
        this.yhteensa++;
    }
    
    public void tulostaJakauma(){
        System.out.println("Arvosanajakauma:");
        System.out.print("5: ");
        tulostaTahtia(this.vitosia);
        System.out.println("");
        System.out.print("4: ");
        tulostaTahtia(this.nelosia);
        System.out.println("");
        System.out.print("3: ");
        tulostaTahtia(this.kolmosia);
        System.out.println("");
        System.out.print("2: ");
        tulostaTahtia(this.kakkosia);
        System.out.println("");
        System.out.print("1: ");
        tulostaTahtia(this.ykkosia);
        System.out.println("");
        System.out.print("0: ");
        tulostaTahtia(this.hylatty);
        System.out.println("");
        System.out.println("Hyväksymisprosentti: " + 100.0*this.hyvaksytyt/this.yhteensa);
    }
    
    public void tulostaTahtia(int montako){
        for (int i=0; i<montako;i++){
            System.out.print("*");
        }
    }
}
