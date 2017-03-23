package liikkuva.olio;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Olio olio;
    
    public Kayttoliittyma(Olio olio){
        this.olio=olio;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());
        lisaaKuuntelijat();

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        Piirtoalusta piirtoalusta = new Piirtoalusta(olio);
        container.add(piirtoalusta);
        
        frame.addKeyListener(new NappaimistonKuuntelija(olio, piirtoalusta));
    }

    private void lisaaKuuntelijat() {
    }

    public JFrame getFrame() {
        return frame;
    }
}
