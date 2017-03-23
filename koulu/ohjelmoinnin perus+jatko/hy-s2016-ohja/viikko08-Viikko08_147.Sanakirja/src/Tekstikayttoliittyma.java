
import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja){
        this.lukija=lukija;
        this.sanakirja=sanakirja;
    }
    
    public void kaynnista(){
        System.out.println("Komennot:\n" +
            "  lisaa - lisää sanaparin sanakirjaan\n" +
            "  kaanna - kysyy sanan ja tulostaa sen käännöksen\n" +
            "  lopeta - poistuu käyttöliittymästä");
        while (true){ 
            System.out.println("");
            System.out.print("Komento: ");
            String komento=lukija.nextLine();
            if (komento.equals("lopeta")){
                System.out.println("Hei hei");
                break;
            } else if(komento.equals("lisaa")){
                lisaa();
            } else if(komento.equals("kaanna")){
                kaanna();
            } else {
                System.out.println("Tuntematon komento!");
            }
        }

    }
    
    public void lisaa(){
        System.out.print("Suomeksi: ");
        String suomeksi = lukija.nextLine();
        System.out.print("Käännös: ");
        String kaannos = lukija.nextLine();
        this.sanakirja.lisaa(suomeksi, kaannos);
    }
    
    public void kaanna(){
        System.out.print("Anna sana: ");
        String sana= lukija.nextLine();
        System.out.println("Käännös: "+ sanakirja.kaanna(sana));
    }
}
