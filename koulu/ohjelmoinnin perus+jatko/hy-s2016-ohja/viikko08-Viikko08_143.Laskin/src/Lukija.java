import java.util.Scanner;

public class Lukija {
    private Scanner lukija;
    
    public Lukija(){
        this.lukija = new Scanner(System.in);
    }
    
    public String lueMerkkijono(){
        String merkkijono=lukija.nextLine();
        return merkkijono;
    }
    
    public int lueKokonaisluku(){
        int luku=Integer.parseInt(lukija.nextLine());
        return luku;
    }
}
