
import java.util.Scanner;

public class Tikkupeli {
    private Scanner lukija;
    private int alkuTikut;
    private int tikut;
    private boolean konettaVastaan;
    private Tekoaly tekoaly;
    private int pelaajanVuoro;
    private boolean eiOleOhi;
    
    public Tikkupeli(Scanner lukija, Tekoaly tekoaly) {
        this.pelaajanVuoro = 1;
        this.eiOleOhi = true;
        this.konettaVastaan = false;
        this.tekoaly = tekoaly;
        this.lukija = lukija;
        while (true){
            System.out.print("\nKuinka monta tikkua pöydällä on aluksi (10-100)? ");
            this.tikut = Integer.parseInt(lukija.nextLine());
            if (this.tikut<=100&&this.tikut>=10){
                break;
            }
            System.out.print("Valitse luku väliltä 10-100\n");
        }
        this.alkuTikut=tikut;
    }
    
    public void uusiPeli(){
        this.pelaajanVuoro=1;
        this.tikut=alkuTikut;
        this.eiOleOhi=true;
    }
    
    public void ketaVastaan(){
        System.out.println("Vaihtoehdot:\n" +
                " Pelaa kaveria vastaan (1)\n" +
                " Pelaa tietokonetta vastaan (2)\n" +
                " Pelaa kouliintunutta tietokonetta vastaan (3)\n" +
                "Minkä vaihtoehdon valitset (1-3)? ");
        int ketaVastaan = Integer.parseInt(lukija.nextLine());
        if (ketaVastaan == 2){
            this.konettaVastaan = true;
        } else if (ketaVastaan == 3){
            this.konettaVastaan = true;
            System.out.println("\nTreenataan...\n");
            treenaa(10000);
        }
    }
    
    public void pelaaKierros(){
        int maara = 0;
        System.out.println("\nPöydällä on " + tikut + " tikkua.");
        while (true){
            if (konettaVastaan&&pelaajanVuoro==2){
                maara = tekoaly.pelaa(this.tikut);
                System.out.println("Tekoäly valitsee "+maara);
            } else {
                System.out.print("Pelaaja "+pelaajanVuoro+": Kuinka monta tikkua nostat (1-3)? ");
                maara = Integer.parseInt(lukija.nextLine());
            }
            if (maara<=3&&maara>=1){
                break;
            } else {
                System.out.println("Valitse luku väliltä 1-3");
            }
        }
        this.tikut-=maara;
        if (this.tikut<1){
            this.eiOleOhi=false;
        } else {
            vaihdaVuoroa();
        }
    }
    
    public void vaihdaVuoroa(){
        if (this.pelaajanVuoro==1) {
            this.pelaajanVuoro=2;
        } else {
            this.pelaajanVuoro=1;
        }
    }
    
    public boolean eiOleOhi(){
        return this.eiOleOhi;
    }
    
    public int pelaaja(){
        return this.pelaajanVuoro;
    }
    
    public int tikkuja(){
        return this.tikut;
    }
    
    public boolean konettaVastaan(){
        return konettaVastaan;
    }
    
    public void treenaa(int kertoja){
        for (int i=0; i<kertoja; i++){
            while (this.eiOleOhi){
                Tekoaly t2 = new Tekoaly();
                t2.luoHatut(tikut);
                if (pelaaja()==1){
                    this.tikut-=this.tekoaly.pelaa(this.tikut);
                } else {
                    this.tikut-=t2.pelaa(this.tikut);
                }
                if (this.tikut<1){
                    this.eiOleOhi=false;
                } else {
                    vaihdaVuoroa();
                }
            }
            if (this.pelaajanVuoro==2){
                this.tekoaly.opi(true);
            } else {
                this.tekoaly.opi(false);
            }
            uusiPeli();
            if (i%1000==0) {
                System.out.println(100*i/kertoja+"%");
            }
        }
    }
}
