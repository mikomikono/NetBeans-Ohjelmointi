import java.util.ArrayList;
public class AioobVirheOhjelma {

    public static void main(String[] args) {
        // Toteuta tänne ohjelma, jossa tapahtuu ArrayIndexOutOfBoundsException -virhe
        ArrayList<String> lista = new ArrayList<>();
        lista.get(-1);
    }
}
