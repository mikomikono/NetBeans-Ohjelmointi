package matopeli.gui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import matopeli.peli.Matopeli;

public class Kayttoliittyma implements Runnable {
    private Container container;
    private JFrame frame;
    private Piirtoalusta piirtoalusta;
    private Matopeli matopeli;
    private int sivunPituus;

    public Kayttoliittyma(Matopeli matopeli, int sivunPituus) {
        this.matopeli = matopeli;
        this.sivunPituus = sivunPituus;
    }

    @Override
    public void run() {
        frame = new JFrame("Matopeli");
        int leveys = (matopeli.getLeveys() + 1) * sivunPituus + 10;
        int korkeus = (matopeli.getKorkeus() + 2) * sivunPituus + 10;

        frame.setPreferredSize(new Dimension(leveys, korkeus));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void luoKomponentit(Container container) {
        this.container = container;
        this.piirtoalusta = new Piirtoalusta(this.matopeli, this.sivunPituus);
        this.container.add(this.piirtoalusta);
        Nappaimistonkuuntelija kuuntelija = new Nappaimistonkuuntelija(this.matopeli.getMato());
        this.frame.addKeyListener(kuuntelija);
        // Huom! Luo ensin piirtoalusta jonka lisäät container-olioon
        // Luo vasta tämän jälkeen näppäimistönkuuntelija, jonka lisäät frame-oliolle
    }
    
    public Paivitettava getPaivitettava(){
        return this.piirtoalusta;
    }


    public JFrame getFrame() {
        return frame;
    }
}
