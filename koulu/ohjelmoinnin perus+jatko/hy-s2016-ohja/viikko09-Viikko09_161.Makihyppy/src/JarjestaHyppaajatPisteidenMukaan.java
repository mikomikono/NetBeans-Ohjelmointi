import java.util.Comparator;

public class JarjestaHyppaajatPisteidenMukaan implements Comparator<Makihyppaaja>{
        
    @Override
    public int compare(Makihyppaaja h1, Makihyppaaja h2) {
        return h1.getPisteet() - h2.getPisteet();
    }
}
