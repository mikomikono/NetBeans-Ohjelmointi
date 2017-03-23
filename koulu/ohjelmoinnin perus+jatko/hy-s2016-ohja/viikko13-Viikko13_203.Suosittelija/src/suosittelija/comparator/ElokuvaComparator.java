package suosittelija.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import suosittelija.domain.Elokuva;
import suosittelija.domain.Arvio;

public class ElokuvaComparator implements Comparator<Elokuva> {
    private Map<Elokuva, List<Arvio>> arviot;
    private Map<Elokuva, Arvio> henkkohtArviot;
    
    public ElokuvaComparator(Map<Elokuva, List<Arvio>> arviot){
        this.arviot = arviot;
        this.henkkohtArviot = new HashMap<>();
    }
    
    public ElokuvaComparator(String sana, Map<Elokuva, Arvio> henkkohtArviot){
        this.arviot = new HashMap<>();
        this.henkkohtArviot = henkkohtArviot;
    }
    
    public int keskiarvo(Elokuva elokuva){
        int summa=0;
        List<Arvio> arvioinnit = arviot.get(elokuva);
        for (Arvio arvio : arvioinnit){
            summa+=arvio.getArvo();
        }
        return summa/arvioinnit.size();
    }

    @Override
    public int compare(Elokuva e1, Elokuva e2) {
        return keskiarvo(e2)-keskiarvo(e1);
    }
    
}
