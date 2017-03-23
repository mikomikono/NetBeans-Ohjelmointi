import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;

@Points("2-6")
public class AsuntoTest {

    @Test
    public void asunnonLuominenOnnistuu() {
        Asunto asunto = new Asunto(1, 10, 10);
        assertFalse(asunto==null);
    }
    
    @Test
    public void asuntoSuurempiAntaaOikeanTuloksen(){
        Asunto asunto1 = new Asunto(10,10,10);
        Asunto asunto2 = new Asunto(1,1,1);
        assertTrue(asunto1.suurempi(asunto2));
    }
    
    @Test
    public void hintaeroOnOikein(){
        Asunto asunto1 = new Asunto(10,10,10);
        Asunto asunto2 = new Asunto(1,1,1);
        assertTrue(asunto1.hintaero(asunto2)==99);
    }
    
    @Test
    public void kalliimpiAntaaOikeanAsunnon(){
        Asunto asunto1=new Asunto(10,10,10);
        Asunto asunto2=new Asunto(1,1,1);
        assertTrue(asunto1.kalliimpi(asunto2));
    }
}
