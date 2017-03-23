
import java.util.ArrayList;
import java.util.Collections;

public class Kasi implements Comparable<Kasi>{
    private ArrayList<Kortti> kasi;
    
    public Kasi(){
        kasi=new ArrayList<>();
    }
    
    public void lisaa(Kortti kortti){
        kasi.add(kortti);
    }
    
    public void tulosta(){
        for (Kortti kortti:kasi){
            System.out.println(kortti);
        }
    }
    
    public void jarjesta(){
        Collections.sort(kasi);
    }
    
    public int arvo(){
        int arvo=0;
        for (Kortti kortti:kasi){
            arvo+=kortti.getArvo();
        }
        return arvo;
    }
    
    public void jarjestaMaittain(){
        Collections.sort(kasi, new SamatMaatVierekkainArvojarjestykseen());
    }
    
    @Override
    public int compareTo(Kasi verrattava){
        int kasiArvo=0;
        for (Kortti kortti: kasi){
            kasiArvo+=kortti.getArvo();
        }
        return kasiArvo-verrattava.arvo();
    }

}
