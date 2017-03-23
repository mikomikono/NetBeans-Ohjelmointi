import java.util.ArrayList;
import java.util.Scanner;

public class Tietokanta {
    ArrayList<Lintu> linnut;
    Scanner lukija;
    
    public Tietokanta(Scanner lukija){
        this.linnut=new ArrayList<>();
        this.lukija=lukija;
    }
    
    public void lisaa(){
        System.out.print("Nimi: ");
        String nimi=lukija.nextLine();
        System.out.print("Latinankielinen nimi: ");
        String latNimi=lukija.nextLine();
        Lintu lintu= new Lintu(nimi, latNimi);
        linnut.add(lintu);
    }
    
    public void havainto(){
        System.out.print("Mikä havaittu? ");
        String havainto=lukija.nextLine();
        int listalla=0;
        for (Lintu lintu:linnut){
            if (lintu.haeNimi().equals(havainto)){
                lintu.lisaaHavainto();
                listalla++;
            }
        }
        if (listalla==0){
            System.out.println("Ei ole lintu!");
        }
    }
    
    public void tilasto(){
        for (Lintu lintu:linnut){
            System.out.println(lintu);
        }
    }
    
    public void nayta(){
        System.out.print("Mikä? ");
        String havainto=lukija.nextLine();
        int listalla=0;
        for (Lintu lintu:linnut){
            if (lintu.haeNimi().equals(havainto)){
                System.out.println(lintu);
                listalla++;
            }
        }
        if (listalla==0){
            System.out.println("Ei ole lintu!");
        }
    }
}
