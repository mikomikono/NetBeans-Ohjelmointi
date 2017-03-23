package perintaa;


import java.util.Scanner;

public class Tehtava3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        Koira koira = new Koira();
        koira.hauku();
        koira.syo();

        Koira vuffe = new Koira("Vuffe");
        vuffe.hauku();
        
        Kissa kissa = new Kissa();
        kissa.mourua();
        kissa.syo();

        Kissa karvinen = new Kissa("Karvinen");
        karvinen.mourua();
        
        Aanteleva aanteleva = new Koira();
        aanteleva.aantele();
    }

}
