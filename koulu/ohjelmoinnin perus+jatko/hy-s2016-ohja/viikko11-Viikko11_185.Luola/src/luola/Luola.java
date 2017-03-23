package luola;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Luola {
    private int leveys;
    private int korkeus;
    private int hirvioita;
    private int siirtoja;
    boolean hirviotLiikkuvat;
    private ArrayList<Hirvio> hirviot;
    private Pelaaja pelaaja;
    
    public Luola(int leveys, int korkeus, int hirvioita, int siirtoja, boolean hirviotLiikkuvat){
        this.leveys=leveys;
        this.korkeus=korkeus;
        this.hirvioita=hirvioita;
        this.siirtoja=siirtoja;
        this.hirviotLiikkuvat=hirviotLiikkuvat;
        this.hirviot=new ArrayList<>();
        this.pelaaja=new Pelaaja(leveys, korkeus);
    }
    
    public void run(Scanner lukija){
        for (int i=0; i<this.hirvioita;i++){
            Hirvio hirvio = new Hirvio(new Random().nextInt(this.leveys),new Random().nextInt(this.korkeus),this.leveys,this.korkeus);
            for (Hirvio onJo:hirviot){
                if (hirvio.equals(onJo)|hirvio.toString().equals("h 0 0")){
                    hirvio.setXY(new Random().nextInt(this.leveys),new Random().nextInt(this.korkeus));
                }
            }
            hirviot.add(hirvio);
        }
        
        while (this.siirtoja>0){
            System.out.println(this.siirtoja+"\n");
            System.out.println(pelaaja);
            for (Hirvio hirvio:hirviot){
                System.out.println(hirvio);
            }
            
            System.out.println("");
            tulostaKentta();
            System.out.println("");
            
            String komento=lukija.nextLine();
            
            ArrayList<Hirvio> poistettavat=new ArrayList<>();
            for (int i=0; i<komento.length(); i++){
                pelaaja.liiku(komento.charAt(i));
                for (Hirvio hirvio:hirviot){
                    if (pelaaja.samaKoordinaatti(hirvio.getX(), hirvio.getY())){
                        poistettavat.add(hirvio);
                    }
                }
            }
            hirviot.removeAll(poistettavat);
            poistettavat.clear();
            
            for (Hirvio hirvio:hirviot){
                for (int i=0; i<komento.length();i++){
                    int x=new Random().nextInt(4);
                    char ch='x';
                    switch (x) {
                        case 0:
                            ch='w';
                            break;
                        case 1:
                            ch='a';
                            break;
                        case 2:
                            ch='s';
                            break;
                        case 3:
                            ch='d';
                            break;
                    }
                    hirvio.liiku(ch);
                    if (hirvio.samaKoordinaatti(pelaaja.getX(), pelaaja.getY())){
                        poistettavat.add(hirvio);
                    }
                }
            }
            hirviot.removeAll(poistettavat);
            poistettavat.clear();
            
            if (hirviot.isEmpty()){
                System.out.println("*~*VOITIT!*~*");
                break;
            }
            
            siirtoja--;
        }
        if(this.siirtoja==0){
            System.out.println("*********\n*HÄVISIT*\n*********");
        }
    }
    
    public void tulostaKentta(){
        for (int y=0;y<this.korkeus;y++){
            for (int x=0;x<this.leveys;x++){
                boolean piirtamatta=true;
                if (pelaaja.samaKoordinaatti(x, y)){
                    System.out.print("@");
                    piirtamatta=false;
                }
                if (piirtamatta){
                    for (Hirvio hirvio:hirviot){
                        if(hirvio.samaKoordinaatti(x, y)){
                            System.out.print("h");
                            piirtamatta=false;
                            break;
                        }
                    }
                }
                if (piirtamatta){
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
}
