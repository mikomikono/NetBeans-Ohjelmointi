package liikkuva.olio;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NappaimistonKuuntelija implements KeyListener {

    private Component component;
    private Olio olio;

    public NappaimistonKuuntelija(Olio olio, Component component) {
        this.olio = olio;
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Nappia " + e.getKeyCode()+" painettu.");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            olio.siirry(-5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            olio.siirry(5, 0);
        }
        
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
}