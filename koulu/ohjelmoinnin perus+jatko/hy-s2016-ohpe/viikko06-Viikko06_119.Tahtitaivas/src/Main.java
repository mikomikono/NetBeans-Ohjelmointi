
public class Main {

    public static void main(String[] args) {
        Tahtitaivas tahtitaivas = new Tahtitaivas(8, 4);
        tahtitaivas.tulosta();
        System.out.println("Tähtiä: " + tahtitaivas.tahtiaViimeTulostuksessa());
        System.out.println("");

        tahtitaivas.tulosta();
        System.out.println("Tähtiä: " + tahtitaivas.tahtiaViimeTulostuksessa());
    }
}
