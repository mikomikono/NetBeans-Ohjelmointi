package hirsipuu;

import java.util.ArrayList;
import java.util.List;

public class Sanalista {

    private List<String> sanat;

    public Sanalista(List<String> sanat) {
        this.sanat = sanat;
    }

    public List<String> sanat() {
        return this.sanat;
    }

    public Sanalista sanatJoidenPituusOn(int pituus) {
        List<String> sanoja = new ArrayList<>();
        for (String sana : this.sanat){
            if (sana.length()==pituus){
                sanoja.add(sana);
            }
        }
        
        return new Sanalista(sanoja);
    }

    public Sanalista sanatJoissaEiEsiinnyKirjainta(char kirjain) {
        List<String> sanoja = new ArrayList<>();
        for (String sana : this.sanat){
            if (!sana.contains(kirjain+"")){
                sanoja.add(sana);
            }
        }
        
        return new Sanalista(sanoja);
    }

    public Sanalista sanatJoissaMerkit(String merkkijono) {
        List<String> sanoja = new ArrayList<>();
        for (String sana : this.sanat){
            if (sana.length()!=merkkijono.length()){
                continue;
            }
            StringBuilder sana1 = new StringBuilder();
            StringBuilder sana2 = new StringBuilder();
            for (int i=0;i<merkkijono.length();i++){
                if (merkkijono.charAt(i)!='-'){
                    sana1.append(sana.charAt(i));
                    sana2.append(merkkijono.charAt(i));
                }
            }
            String s1 = sana1+"";
            String s2 = sana2+"";
            if (s1.equalsIgnoreCase(s2)){
                sanoja.add(sana);
            }
        }
        
        return new Sanalista(sanoja);
    }

    public int koko() {
        return this.sanat.size();
    }
}
