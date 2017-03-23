import java.util.ArrayList;

public class Opiskelija {
    private String nimi;
    private ArrayList<Kurssisuoritus> suoritukset;
    
    public Opiskelija(String nimi){
        this.nimi=nimi;
        this.suoritukset=new ArrayList<>();
    }
    
    public void suorita(String kurssi, int arvosana, int opintopisteet){
        Kurssisuoritus suoritus = new Kurssisuoritus(kurssi, arvosana,opintopisteet);
        boolean onkoKayty=false;
        int kaydynIndeksi=0;
        for(Kurssisuoritus suoritetut:suoritukset){
            if(suoritetut.getKurssi().equals(kurssi)){
                onkoKayty=true;
                kaydynIndeksi=suoritukset.indexOf(suoritetut);
            }
        }
        if (onkoKayty){
            if (suoritukset.get(kaydynIndeksi).getArvosana()<arvosana){
                suoritukset.get(kaydynIndeksi).setArvosana(arvosana);
            }
        } else {
            suoritukset.add(suoritus);
        }
    }
    
    public int opintopisteita(){
        int opintopisteet=0;
        for (Kurssisuoritus kurssi:suoritukset){
            int op=kurssi.getOpintopisteet();
            opintopisteet+=op;
        }
        return opintopisteet;
    }
    
    public void suoritusote(){
        System.out.println(this.nimi);
        for (Kurssisuoritus kurssi:suoritukset){
            System.out.println("    "+kurssi);
        }
        System.out.println("Opintopisteitä: "+ opintopisteita());
    }
}
