package hirsipuu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hirsipuu {

    private Sanalista sanalista;
    private List<Character> tehdytArvaukset;
    private int arvauksiaJaljella;
    private String arvattava;

    public Hirsipuu(Sanalista sanalista, int arvauksiaAlussa) {
        this.sanalista = sanalista;
        this.arvauksiaJaljella = arvauksiaAlussa;
        this.tehdytArvaukset = new ArrayList<>();
        
        Collections.shuffle(this.sanalista.sanat());
        this.arvattava = this.sanalista.sanat().get(0);
    }

    public List<Character> arvaukset() {
        return this.tehdytArvaukset;
    }

    public int arvauksiaJaljella() {
        return this.arvauksiaJaljella;
    }
    
    
    public boolean arvaa(Character kirjain) {
        this.tehdytArvaukset.add(kirjain);
        boolean arvaus = this.arvattava.contains(kirjain+"");
        if (arvaus){
            return true;
        } else {
            this.arvauksiaJaljella--;
            return false;
        }
    }

    
    public String sana() {
        StringBuilder sana = new StringBuilder();
        for (int i=0; i<this.arvattava.length();i++){
            sana.append('-');
        }
        for (int i=0; i<sana.length(); i++){
            for (Character ch : this.arvaukset()){
                if (this.arvattava.charAt(i)==ch){
                    sana.replace(i,i+1, this.arvattava.charAt(i)+"");
                }
            }
        }
        return sana+"";
    }

    public String oikeaSana() {
        return this.arvattava;
    }

    public boolean onLoppu() {
        for (int i=0; i<this.arvattava.length();i++){
            if (!this.tehdytArvaukset.contains(this.arvattava.charAt(i))){
                return false;
            }
        }
        return true;
    }


}
