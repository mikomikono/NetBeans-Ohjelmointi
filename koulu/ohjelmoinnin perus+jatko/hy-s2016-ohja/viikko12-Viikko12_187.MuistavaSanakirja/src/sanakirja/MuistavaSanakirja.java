package sanakirja;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MuistavaSanakirja {
    private HashMap<String, String> kaannokset1;
    private HashMap<String, String> kaannokset2;
    private File tiedosto;
    
    public MuistavaSanakirja(){
        this.kaannokset1 = new HashMap<>();
        this.kaannokset2 = new HashMap<>();
    }
    
    public MuistavaSanakirja(String tiedosto){
        this.kaannokset1 = new HashMap<>();
        this.kaannokset2 = new HashMap<>();
        this.tiedosto = new File(tiedosto);
    }
    
    public void lisaa(String sana, String kaannos) {
        boolean eiOleJo = true;
        if (kaannokset1.containsKey(sana)|kaannokset2.containsKey(sana)){
            eiOleJo = false;
        }
        if (eiOleJo){
            kaannokset1.put(sana, kaannos);
            kaannokset2.put(kaannos, sana);
        }
        
    }
    
    public String kaanna(String sana){
        String kaannos=null;
        if (kaannokset1.containsKey(sana)){
            kaannos=kaannokset1.get(sana);
        } else if (kaannokset2.containsKey(sana)){
            kaannos=kaannokset2.get(sana);
        }
        return kaannos;
    }
    
    public void poista(String sana){
        if (kaannokset1.containsKey(sana)){
            String key = kaannokset1.get(sana);
            kaannokset1.remove(sana);
            kaannokset2.remove(key);
        } else if (kaannokset2.containsKey(sana)){
            String key = kaannokset2.get(sana);
            kaannokset2.remove(sana);
            kaannokset1.remove(key);
        }
    }
    
    public boolean lataa(){
        Scanner lukija = null;
        try {
            lukija = new Scanner(this.tiedosto);
        } catch (Exception e){
            return false;
        }
        while (lukija.hasNextLine()){
            String rivi = lukija.nextLine();
            String [] osat = rivi.split(":");
            kaannokset1.put(osat[0], osat[1]);
            kaannokset2.put(osat[1], osat[0]);
        }
        lukija.close();
        return true;
    }
    
    public boolean tallenna() {
        FileWriter kirjoittaja;
        try {
            kirjoittaja = new FileWriter(this.tiedosto);
        } catch (IOException ex) {
            return false;
        }
        for (String avain:kaannokset1.keySet()){
            try {
                kirjoittaja.write(avain+":"+kaannokset1.get(avain)+"\n");
            } catch (IOException ex) {
                return false;
            }
        }
        try {
            kirjoittaja.close();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }
}
