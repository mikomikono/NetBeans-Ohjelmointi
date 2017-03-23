import java.util.ArrayList;
import java.util.Scanner;

public class Lentokentta {
    private ArrayList<Lentokone> koneet;
    private ArrayList<Lento> lennot;
    private Scanner lukija;
     
    public Lentokentta(Scanner lukija){
        this.lukija=lukija;
        this.koneet= new ArrayList<>();
        this.lennot = new ArrayList<>();
    }
    
    public void lisaaKone(){
        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus=lukija.nextLine();
        System.out.print("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti= Integer.parseInt(lukija.nextLine());
        Lentokone kone=new Lentokone(tunnus, kapasiteetti);
        koneet.add(kone);
    }
    
    public void lisaaLento(){
        System.out.print("Anna lentokoneen tunnus: ");
        String koneenTunnus=lukija.nextLine();
        System.out.print("Anna lähtöpaikan tunnus: ");
        String lahtoTunnus=lukija.nextLine();
        System.out.print("Anna kohdepaikan tunnus: ");
        String kohdeTunnus=lukija.nextLine();
        Lentokone kone=new Lentokone("ei konetta", 0);
        for (Lentokone lisatutKoneet:koneet){
            if (lisatutKoneet.getTunnus().equals(koneenTunnus)){
                kone=lisatutKoneet;
            }
        }
        Lento lento=new Lento(kone, lahtoTunnus, kohdeTunnus);
        lennot.add(lento);
    }    
    
    public void tulostaKoneet(){
        for (Lentokone kone:koneet){
            System.out.println(kone);
        }
    }

    public void tulostaLennot(){
        for (Lento lento:lennot){
            lento.tulostaLento();
        }
    }
    
    public void tulostaKone(){
        System.out.print("Mikä kone: ");
        String koneenTunnus=lukija.nextLine();
        for (Lentokone kone:koneet){
            if (kone.getTunnus().equals(koneenTunnus)){
                System.out.println(kone);
            }
        }
    }
}
