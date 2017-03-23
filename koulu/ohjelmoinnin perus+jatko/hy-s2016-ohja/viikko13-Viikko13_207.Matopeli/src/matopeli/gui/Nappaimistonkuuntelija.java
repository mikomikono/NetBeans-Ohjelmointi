package matopeli.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import matopeli.Suunta;
import matopeli.domain.Mato;

public class Nappaimistonkuuntelija implements KeyListener {
    private Mato mato;
    
    public Nappaimistonkuuntelija(Mato mato){
        this.mato=mato;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                mato.setSuunta(Suunta.VASEN);
                break;
            case 38:
                mato.setSuunta(Suunta.YLOS);
                break;
            case 39:
                mato.setSuunta(Suunta.OIKEA);
                break;
            default:
                mato.setSuunta(Suunta.ALAS);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
