package liikkuvakuvio;

import java.awt.Graphics;
import java.util.ArrayList;

public class Koostekuvio extends Kuvio {
    private ArrayList<Kuvio> kuviot;

    public Koostekuvio() {
        super(0,0);
        kuviot = new ArrayList<>();
    }
    
    public void liita(Kuvio k){
        kuviot.add(k);
    }

    @Override
    public void piirra(Graphics graphics) {
        for (Kuvio kuvio : kuviot){
            kuvio.piirra(graphics);
        }
    }
    
    @Override
    public void siirra(int dx, int dy){
        for (Kuvio kuvio : kuviot){
            kuvio.siirra(dx, dy);
        }
    }
    
}
