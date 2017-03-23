
public class Hymiot {

    public static void main(String[] args) {
        // Testaa metodisi toimintaa ainakin seuraavilla kutsuilla
        tulostaHymioityna("Metodi");
        tulostaHymioityna("Hajautustaulu");
        tulostaHymioityna("Rajapinta");
    }
    
    private static void tulostaHymioityna(String merkkijono){
        int hymioita;
        if (merkkijono.length()%2==0){
            hymioita = merkkijono.length()/2+3;
        } else {
            hymioita = (merkkijono.length()+1)/2+3;
        }
        tulostaHymioita(hymioita);
        System.out.println("");
        tulostaHymioita(1);
        System.out.print(" "+merkkijono+" ");
        if (merkkijono.length()%2==1){
            System.out.print(" ");
        }
        tulostaHymioita(1);
        System.out.println("");
        tulostaHymioita(hymioita);
        System.out.println("");
    }
    
    private static void tulostaHymioita(int maara){
        for (int i=0; i<maara;i++){
            System.out.print(":)");        
        }
    }

}
