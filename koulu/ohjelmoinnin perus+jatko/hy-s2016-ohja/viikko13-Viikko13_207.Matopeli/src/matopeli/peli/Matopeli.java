package matopeli.peli;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import matopeli.Suunta;
import matopeli.domain.Mato;
import matopeli.domain.Omena;
import matopeli.domain.Pala;
import matopeli.gui.Paivitettava;

public class Matopeli extends Timer implements ActionListener {

    private int leveys;
    private int korkeus;
    private boolean jatkuu;
    private Paivitettava paivitettava;
    private Mato mato;
    private Omena omena;

    public Matopeli(int leveys, int korkeus) {
        super(1000, null);

        this.leveys = leveys;
        this.korkeus = korkeus;
        this.jatkuu = true;

        addActionListener(this);
        setInitialDelay(2000);

        mato = new Mato(this.leveys/2, this.korkeus/2, Suunta.ALAS);
        
        omena = new Omena(new Random().nextInt(this.leveys), new Random().nextInt(this.korkeus));
        while (omena.getX()==this.leveys/2&&omena.getY()==this.korkeus/2){
            omena = new Omena(new Random().nextInt(this.leveys), new Random().nextInt(this.korkeus));
        }
    }


    public boolean jatkuu() {
        return jatkuu;
    }

    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    public int getKorkeus() {
        return korkeus;
    }

    public int getLeveys() {
        return leveys;
    }
    
    public Mato getMato(){
        return this.mato;
    }
    
    public void setMato(Mato mato){
        this.mato=mato;
    }
    
    public Omena getOmena(){
        return this.omena;
    }
    
    public void setOmena(Omena omena){
        this.omena=omena;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!jatkuu) {
            return;
        }
        mato.liiku();
        if (mato.osuu(omena)){
            mato.kasva();
            omena = new Omena(new Random().nextInt(this.leveys), new Random().nextInt(this.korkeus));
            while (omena.getX()==this.leveys/2&&omena.getY()==this.korkeus/2){
                omena = new Omena(new Random().nextInt(this.leveys), new Random().nextInt(this.korkeus));
            }
        }
        if (mato.osuuItseensa()){
            this.jatkuu=false;
        }
        for (Pala pala : mato.getPalat()){
            if (pala.getX()<0|pala.getX()>=this.leveys|pala.getY()<0|pala.getY()>=this.korkeus){
                this.jatkuu=false;
            }
        }
        this.paivitettava.paivita();
        this.setDelay(1000 / mato.getPituus());
    }

}
