
import java.io.*;
import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.Test;
import static org.junit.Assert.*;

public class OhjelmaTest {

    @Points("ohja-konekoe3")
    @Test
    public void testManual() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Ohjelma.main(new String[0]);
        assertTrue("", outContent.toString().toLowerCase().contains("aloita"));
    }
}
