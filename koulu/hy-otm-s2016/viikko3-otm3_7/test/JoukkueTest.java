import org.junit.Test;

import static org.junit.Assert.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.ArrayList;
import org.junit.Before;

@Points("3-7")
public class JoukkueTest {
    Joukkue joukkue;
    Pelaaja pelaaja;
    
    @Before
    public void setUp(){
        joukkue = new Joukkue("Kumpulan pallo");
        pelaaja = new Pelaaja("Matti");
    }
    
    @Test
    public void alussaKokoNolla() {
        assertEquals(0, joukkue.koko());
    }
    
    @Test
    public void haeNimiToimii(){
        assertEquals("Kumpulan pallo", joukkue.haeNimi());
    }
    
    @Test
    public void lisaaPelaajaToimii(){
        joukkue.lisaaPelaaja(pelaaja);
        assertEquals(1, joukkue.koko());
    }
    
    @Test
    public void pelaajienTulostusToimii(){
        joukkue.lisaaPelaaja(pelaaja);
        ArrayList<String> pelaajat=joukkue.pelaajatMerkkijonolistana();
        assertFalse(pelaajat.isEmpty());
    }
    
    @Test
    public void maksmikokoToimii(){
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        assertEquals(5, joukkue.koko());
    }
    
    @Test
    public void maksimikoonVaihtaminenOnnistuu(){
        joukkue.asetaMaksimikoko(7);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        assertEquals(7, joukkue.koko());
    }
    
    @Test
    public void maalitOikeinIlmanMaaleja(){
        joukkue.lisaaPelaaja(pelaaja);
        assertEquals(0, joukkue.maalit());
    }
    
    @Test
    public void maalitOikeinOnMaaleja(){
        Pelaaja newPelaaja = new Pelaaja("Arto", 10);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(pelaaja);
        joukkue.lisaaPelaaja(newPelaaja);
        joukkue.lisaaPelaaja(newPelaaja);
        assertEquals(20, joukkue.maalit());
        
    }
}
