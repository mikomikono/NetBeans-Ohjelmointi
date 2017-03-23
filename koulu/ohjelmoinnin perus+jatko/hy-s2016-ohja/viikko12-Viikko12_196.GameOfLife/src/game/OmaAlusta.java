package game;

import gameoflife.GameOfLifeAlusta;
import java.util.Random;

public class OmaAlusta extends GameOfLifeAlusta {

    public OmaAlusta(int leveys, int korkeus) {
        super(leveys, korkeus);
    }

    @Override
    public void alustaSatunnaisetPisteet(double d) {
        Random random = new Random();
        for (int x = 0; x < super.getLeveys(); x++) {
            for (int y = 0; y < super.getKorkeus(); y++) {
                double todennakoisyys = random.nextDouble();
                if (todennakoisyys > d) {
                    super.getAlusta()[x][y] = false;
                } else {
                    super.getAlusta()[x][y] = true;
                }
            }
        }
        
    }

    @Override
    public boolean onElossa(int x, int y) {
        if (x < 0 | x >= super.getLeveys()) {
            return false;
        } else if (y < 0 | y >= super.getKorkeus()) {
            return false;
        } else {
            return super.getAlusta()[x][y];
        }
    }

    @Override
    public void muutaElavaksi(int x, int y) {
        if (x < 0 | x >= super.getLeveys()) {
            int i = x;
        } else if (y < 0 | y >= super.getKorkeus()) {
            int i = x;
        } else {
            super.getAlusta()[x][y] = true;
        }
    }

    @Override
    public void muutaKuolleeksi(int x, int y) {
        if (x < 0 | x >= super.getLeveys()) {
            int i = x;
        } else if (y < 0 | y >= super.getKorkeus()) {
            int i = x;
        } else {
            super.getAlusta()[x][y] = false;
        }
    }

    @Override
    public int getElossaOlevienNaapurienLukumaara(int x, int y) {
        int naapurit = 0;
        
        for (int x1 = -1; x1 <= 1; x1++) {
            for (int y1 = -1; y1 <= 1; y1++) {
                if (x + x1 < 0 | x + x1 >= super.getLeveys()) {
                    continue;
                }
                if (y + y1 < 0 | y + y1 >= super.getKorkeus()) {
                    continue;
                }
                if (y1 == 0 && x1 == 0) {
                    continue;
                }
                if (super.getAlusta()[x + x1][y + y1] == true) {
                    naapurit++;
                }
            }
        }
        
        return naapurit;
    }

    @Override
    public void hoidaSolu(int x, int y, int elossaOleviaNaapureita) {
        if (elossaOleviaNaapureita < 2) {
            muutaKuolleeksi(x, y);
        } else if (elossaOleviaNaapureita == 3) {
            muutaElavaksi(x, y);
        } else if (elossaOleviaNaapureita > 3) {
            muutaKuolleeksi(x, y);
        }
    }
    
}