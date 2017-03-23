package analyysi;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class SanojenLaskija {
    private Scanner lukija;
    private File tiedosto;
    private ArrayList<String> rivit;
    
    public SanojenLaskija(Scanner lukija, File tiedosto){
        this.lukija=lukija;
        this.tiedosto=tiedosto;
        this.rivit = new ArrayList<>();
        while (lukija.hasNextLine()){
            String rivi = lukija.nextLine();
            if (!rivi.equals("")){
                rivit.add(rivi);
            }
        }
    }
    
    public int laskeSanat(){
        int sanoja=0;
        for (String rivi : rivit){
            String [] sanat = rivi.split(" ");
            for (int i=0; i<sanat.length;i++){
                sanoja++;
            }
        }
        return sanoja;
    }
    
    public int laskeUniikitSanat(){
        int sanoja=0;
        ArrayList<String> uniikitSanat = new ArrayList<>();
        ArrayList<String> sanat = new ArrayList<>();
        ArrayList<String> lapikaydytSanat = new ArrayList<>();
        for (String rivi : rivit){
            String [] sana = rivi.split(" ");
            for (int i=0; i<sana.length;i++){
                String sanaPienella = sana[i].toLowerCase();
                if (!sanaPienella.equals(" ")){
                    sanat.add(sanaPienella);
                }
            }
        }
        for (String sana:sanat){
            if (!uniikitSanat.contains(sana)&&!lapikaydytSanat.contains(sana)){
                uniikitSanat.add(sana);
                lapikaydytSanat.add(sana);
            } else if (!uniikitSanat.contains(sana)&&lapikaydytSanat.contains(sana)){
                
            } else if (uniikitSanat.contains(sana)){
                uniikitSanat.remove(sana);
            }
        }

        //ratkaisin tehtävän useammalla tapaa kun luulin että ensimmäinen oli väärin
        //turns out että tehtäväkuvauksen esimerkkitulosteessa oli uniikkien sanojen määrä väärin
        //pohjan mukana tulleessa tiedostossa niitä on vain 60, ei 114
        //tiedän sen, koska kävin ne epätoivoissani käsin läpi
        //anyway, en halunnut poistaa tätä koodia koska se kuitenkin (ilmeisesti) toimii
        //ja koska minua ärsyttää kun tein tämän tehtävän legit varmaan kolmesti
        //joten tässä se nyt on, ensi kerralla vähän tarkemmin jookos kookos?
        
//        for (String sana:sanat){
//            if (!onkoSanaListallaUseasti(sanat, sana)){
//                uniikitSanat.add(sana);
//                sanoja++;
//            }
//        }

        return uniikitSanat.size();
    }
    
//    public boolean onkoSanaListallaUseasti(ArrayList<String> sanat, String sana){
//        int montako=0;
//        for (String s : sanat){
//            if (s.equals(sana)){
//                montako++;
//            }
//            
//            if(montako>1){
//                return true;
//            }
//        }
//        return false;
//    }
}
