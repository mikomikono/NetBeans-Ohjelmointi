import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;

@Points("2-7")
public class PaivaysTest {

    @Test
    public void toStringUutenavuotena() {
        Paivays paivays = new Paivays(1,1,2017);
        assertEquals("1.1.2017", paivays.toString());
    }
    
    @Test
    public void eteneYksiEteneeOikein(){
        Paivays paivays = new Paivays(1,1,2017);
        paivays.etene();
        assertEquals("2.1.2017", paivays.toString());
    }
    
    @Test
    public void eteneMontaEteneeOikein(){
        Paivays paivays = new Paivays(1,1,2017);
        paivays.etene(10);
        assertEquals("11.1.2017",paivays.toString());
    }
    
    @Test
    public void kuukausiVaihtuuOikein(){
        Paivays paivays = new Paivays(30,1,2017);
        paivays.etene();
        assertEquals("1.2.2017", paivays.toString());
    }
    
    @Test
    public void vuosiVaihtuuOikein(){
        Paivays paivays = new Paivays(30,12,2016);
        paivays.etene();
        assertEquals("1.1.2017", paivays.toString());
    }
    
    @Test
    public void paivienPaastaAntaaOikeanPaivan(){
        Paivays paivays = new Paivays(1,1,2017);
        Paivays paivays2 = paivays.paivienPaasta(10);
        assertEquals("11.1.2017", paivays2.toString());
    }
    
    @Test
    public void aiemminAntaaOikeanVastauksen(){
        Paivays paivays1 = new Paivays(8,11,2016);
        Paivays paivays2 = new Paivays(20,1,2017);
        assertTrue(paivays1.aiemmin(paivays2));
    }
}
