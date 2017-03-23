
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Eriytymismalli {

    private int[][] taulukko;
    private int leveys;
    private int korkeus;
    private double prosTyhjia;
    private double tyytyvaisyysraja;
    private boolean tyytymattomiaLoytyy;

    public Eriytymismalli(int leveys, int korkeus, double prosTyhjia, double tyytyvaisyysraja) {
        this.leveys = leveys;
        this.korkeus = korkeus;

        this.taulukko = new int[korkeus][leveys];

        this.prosTyhjia = prosTyhjia;
        this.tyytyvaisyysraja = tyytyvaisyysraja;

        this.tyytymattomiaLoytyy = true;
    }

    public int[][] annaData() {
        return this.taulukko;
    }

    public void alusta(int joukkoja) {
        if (joukkoja < 2) {
            joukkoja = 2;
        }

        if (joukkoja > 4) {
            joukkoja = 4;
        }

        asetaKaikkiTyhjiksi();
        arvoAlkuarvot(joukkoja);
    }

    public void asetaKaikkiTyhjiksi() {
        // luo tänne metodi, joka asettaa jokaisen taulukon alkion
        // arvoksi luvun 0
        for (int x=0;x<this.leveys;x++){
            for (int y=0;y<this.korkeus;y++){
                this.taulukko[y][x]=0;
            }
        }

    }

    public ArrayList<Piste> tyhjatPaikat() {
        ArrayList<Piste> tyhjat = new ArrayList<>();
        // luo täällä lista, missä on kaikki tyhjät paikat piste-olioina
        // tyhjissä paikoissa on arvo 0
        for (int x=0;x<this.leveys;x++){
            for (int y=0;y<this.korkeus;y++){
                if (taulukko[y][x]==0){
                    Piste piste = new Piste(x,y);
                    tyhjat.add(piste);
                }
            }
        }


        return tyhjat;
    }

    public void paivita() {
        ArrayList<Piste> tyytymattomat = haeTyytymattomat();

        if (tyytymattomat.isEmpty()) {
            this.tyytymattomiaLoytyy = false;
            return;
        }

        Collections.shuffle(tyytymattomat);

        while (!tyytymattomat.isEmpty()) {
            Piste tyytymaton = tyytymattomat.remove(0);

            ArrayList<Piste> tyhjat = tyhjatPaikat();
            Collections.shuffle(tyhjat);

            Piste tyhja = tyhjat.get(0);

            this.taulukko[tyhja.getY()][tyhja.getX()] = this.taulukko[tyytymaton.getY()][tyytymaton.getX()];
            this.taulukko[tyytymaton.getY()][tyytymaton.getX()] = 0;
        }
    }

    public ArrayList<Piste> haeTyytymattomat() {
        ArrayList<Piste> tyytymattomat = new ArrayList<>();
        ArrayList<Piste> tyhjat = new ArrayList<>();
        tyhjat=(tyhjatPaikat());
        for (int x=0; x<this.leveys; x++){
            for (int y=0;y<this.korkeus;y++){
                Piste koordinaatti=new Piste(x,y);
                if (!tyhjat.contains(koordinaatti)){
                    int naapurit=0;
                    int eri=0;
                    for(int x1=x-1;x1<=x+1;x1++){
                        if (x1>=0&&x1<this.leveys){
                            for (int y1=y-1;y1<=y+1;y1++){
                                if (y1>=0&&y1<this.korkeus){
                                    if (x!=x1&&y!=y1&&taulukko[y1][x1]!=0){
                                        naapurit++;
                                        if (taulukko[y1][x1]!=taulukko[y][x]){
                                            eri++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    double tyytyvaisyys=1.0*eri/naapurit;
                    if (tyytyvaisyys>this.tyytyvaisyysraja){
                        Piste piste = new Piste (x,y);
                        tyytymattomat.add(piste);
                    }
                }
            }
        }
        return tyytymattomat;
    }

    public void arvoAlkuarvot(int joukkoja) {
        Random arpoja = new Random();

        ArrayList<Piste> tyhjat = tyhjatPaikat();
        Collections.shuffle(tyhjat);

        for (int i = 0; i < (1.0 - prosTyhjia) * tyhjat.size(); i++) {
            int x = tyhjat.get(i).getX();
            int y = tyhjat.get(i).getY();
            this.taulukko[y][x] = 1 + arpoja.nextInt(joukkoja);
        }
    }

    public boolean tyytymattomiaLoytyy() {
        return tyytymattomiaLoytyy;
    }

}
