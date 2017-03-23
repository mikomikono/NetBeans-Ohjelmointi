package matopeli.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import matopeli.domain.Mato;
import matopeli.domain.Omena;
import matopeli.domain.Pala;
import matopeli.peli.Matopeli;

public class Piirtoalusta extends JPanel implements Paivitettava {
    private Matopeli matopeli;
    private int palanSivunPituus;
    
    public Piirtoalusta(Matopeli matopeli, int sivunPituus){
        this.matopeli=matopeli;
        this.palanSivunPituus=sivunPituus;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        Mato mato = this.matopeli.getMato();
        List<Pala> palat = mato.getPalat();
        for (Pala pala : palat){
            g.fill3DRect(pala.getX()*this.palanSivunPituus, pala.getY()*this.palanSivunPituus, this.palanSivunPituus, this.palanSivunPituus, true);
        }
        g.setColor(Color.RED);
        Omena omena = this.matopeli.getOmena();
        g.fillOval(omena.getX()*this.palanSivunPituus, omena.getY()*this.palanSivunPituus, this.palanSivunPituus, this.palanSivunPituus);
    }

    @Override
    public void paivita() {
        super.repaint();
    }
}
