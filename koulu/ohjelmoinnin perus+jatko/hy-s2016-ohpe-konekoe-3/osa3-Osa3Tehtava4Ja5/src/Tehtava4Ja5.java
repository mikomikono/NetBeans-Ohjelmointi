
public class Tehtava4Ja5 {

    public static void main(String[] args) {
        Opiskelija pekka = new Opiskelija("Pekka");
        pekka.suorita("Tietorakenteet", 2, 8);
        pekka.suorita("Johdatus yliopistomatematiikkaan", 5, 4);
        pekka.suorita("Vuorovaikutukset ja kappaleet", 1, 5);
        pekka.suoritusote();
        pekka.suorita("Tietorakenteet", 1, 8);
        pekka.suorita("Vuorovaikutukset ja kappaleet", 5, 5);
        System.out.println("\nuusintakokeiden jälkeen:\n");
        pekka.suoritusote();
    }

}
