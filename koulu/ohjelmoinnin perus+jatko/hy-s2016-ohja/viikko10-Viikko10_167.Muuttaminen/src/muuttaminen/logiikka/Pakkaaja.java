package muuttaminen.logiikka;

import java.util.ArrayList;
import java.util.List;
import muuttaminen.domain.Muuttolaatikko;
import muuttaminen.domain.Tavara;

public class Pakkaaja {
    private int laatikoidenTilavuus;
    
    public Pakkaaja(int laatikoidenTilavuus){
        this.laatikoidenTilavuus=laatikoidenTilavuus;
    }
    
    public List<Muuttolaatikko> pakkaaTavarat(List<Tavara> tavarat){
        List<Muuttolaatikko> laatikot = new ArrayList<>();
        Muuttolaatikko laatikko= new Muuttolaatikko(this.laatikoidenTilavuus);
        for (Tavara tavara:tavarat){
            if (laatikko.getTilavuus()+tavara.getTilavuus()<=this.laatikoidenTilavuus){
                laatikko.lisaaTavara(tavara);
            } else {
                laatikot.add(laatikko);
                laatikko = new Muuttolaatikko(this.laatikoidenTilavuus);
                laatikko.lisaaTavara(tavara);
            }
       }
        laatikot.add(laatikko);
        return laatikot;
    }
}
