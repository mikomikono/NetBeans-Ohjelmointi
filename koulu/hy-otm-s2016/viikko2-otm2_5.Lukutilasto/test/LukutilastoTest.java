import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Before;

@Points("2-5")
public class LukutilastoTest {
    Lukutilasto tilasto;
    
    @Before
    public void setUp(){
        tilasto = new Lukutilasto();
    }

    @Test
    public void alussaSummaOnNolla() {
        assertEquals(0, tilasto.summa());
    }
    
    @Test
    public void alussaKeskiarvoOnNolla(){
        assertTrue(tilasto.keskiarvo()==0);
    }
    
    @Test
    public void ensimmainenLisataanOikein(){
        tilasto.lisaaLuku(5);
        assertTrue(tilasto.summa()==5);
    }
    
    @Test
    public void lukujenMaaraOikeinYhdella(){
        tilasto.lisaaLuku(5);
        assertTrue(tilasto.haeLukujenMaara()==1);
    }
    
    @Test
    public void toinenLisatanOikein(){
        tilasto.lisaaLuku(7);
        tilasto.lisaaLuku(37);
        assertTrue(tilasto.summa()==44);
    }
    
    @Test
    public void lukujenMaaraOikeinUsealla(){
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(3);
        tilasto.lisaaLuku(3);
        assertTrue(tilasto.haeLukujenMaara()==7);
    }
    
    @Test
    public void keskiarvoOikein(){
        tilasto.lisaaLuku(5);
        tilasto.lisaaLuku(1);
        tilasto.lisaaLuku(7);
        tilasto.lisaaLuku(35);
        tilasto.lisaaLuku(4);
        tilasto.lisaaLuku(13);
        tilasto.lisaaLuku(6);
        tilasto.lisaaLuku(7);
        assertTrue(tilasto.keskiarvo()==1.0*(5+1+7+35+4+13+6+7)/8);
    }
}
