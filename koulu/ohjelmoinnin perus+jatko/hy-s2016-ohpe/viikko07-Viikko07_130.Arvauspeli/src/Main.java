
public class Main {

    public static void main(String[] args) {
        // testaa arvauspeliä täällä
        // luodaan peli-olio
        Arvauspeli peli = new Arvauspeli();

        // pelataan pari kierrosta
//        peli.pelaa(1,10);  // arvattava luku nyt välillä 1-10
        peli.pelaa(1,4);  // arvattava luku nyt välillä 10-99
    }
}
