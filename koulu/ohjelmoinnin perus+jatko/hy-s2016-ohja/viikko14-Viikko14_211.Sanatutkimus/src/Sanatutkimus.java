
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sanatutkimus {
    private List<String> sanat;
    private Scanner lukija;
    
    public Sanatutkimus(String tiedostonimi){
        this.sanat = new ArrayList<>();
        try {
            this.lukija = new Scanner(new File(tiedostonimi), "UTF-8");
        } catch (FileNotFoundException ex) {
            System.out.println("Tiedosto ei löydy.");
        }
        while (this.lukija.hasNextLine()){
            this.sanat.add(lukija.nextLine());
        }
    }
    
    public int sanojenMaara(){
        return this.sanat.size();
    }
    
    public boolean onkoSanaa(String sana){
        return this.sanat.contains(sana);
    }
    
    public int laskeSanat(int pituus){
        int yhteensa = 0;
        for (String sana : this.sanat){
            if (sana.length()==pituus){
                yhteensa++;
            }
        }
        return yhteensa;
    }
    
    public void pituustilasto(){
        for (int i=1; i<=30; i++){
            System.out.println(i+" "+laskeSanat(i));
        }
    }
    
    public int laskeKirjaimet(char kirjain){
        int yhteensa = 0;
        for (String sana : this.sanat){
            for (int i=0; i<sana.length(); i++){
                if (sana.charAt(i)==kirjain){
                    yhteensa++;
                }
            }
        }
        return yhteensa;
    }
    
    public void kirjainTilasto(){
        String aakkoset = "abcdefghijklmnopqrstuvwxyzåäö";
        for (int i = 0; i<aakkoset.length(); i++){
            System.out.println(aakkoset.charAt(i)+" "+laskeKirjaimet(aakkoset.charAt(i)));
        }
    }
    
    public ArrayList<String> haePituudella(int pituus){
        ArrayList<String> haetutSanat = new ArrayList<>();
        for (String sana : this.sanat){
            if (sana.length()==pituus){
                haetutSanat.add(sana);
            }
        }
        return haetutSanat;
    }
    
    public ArrayList<String> haeOsalla(String osa){
        ArrayList<String> haetutSanat = new ArrayList<>();
        for (String sana : this.sanat){
            if (sana.lastIndexOf(osa)!=-1){
                haetutSanat.add(sana);
            }
        }
        return haetutSanat;
    }
    
    public ArrayList<String> haePalindromit(){
        ArrayList<String> haetutSanat = new ArrayList<>();
        for (String sana : this.sanat){
            if (sana.equals(kaanna(sana))){
                haetutSanat.add(sana);
            }
        }
        return haetutSanat;
    }
    
    public String kaanna(String sana){
        String kaannettuSana = "";
        for (int i = sana.length()-1; i>=0; i--){
            kaannettuSana+=sana.charAt(i);
        }
        return kaannettuSana;
    }
    
    public ArrayList<String> haeRistikkoon(String pohja){
        ArrayList<String> haetutSanat = new ArrayList<>();
        for (String sana : this.sanat){
            if (sana.length()!=pohja.length()){
                continue;
            }
            StringBuilder sana1 = new StringBuilder();
            StringBuilder sana2 = new StringBuilder();
            for (int i=0;i<pohja.length();i++){
                if (pohja.charAt(i)!='?'){
                    sana1.append(sana.charAt(i));
                    sana2.append(pohja.charAt(i));
                }
            }
            String s1 = sana1+"";
            String s2 = sana2+"";
            if (s1.equals(s2)){
                haetutSanat.add(sana);
            }
        }
        return haetutSanat;
    }
}
