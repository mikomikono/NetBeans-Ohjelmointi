
public class Main {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        System.out.println(laskeTaulukonLukujenSumma(taulukko));
    }
    
    public static int laskeTaulukonLukujenSumma(int[] taulukko){
        int summa=0;
        for (int luvut: taulukko){
            summa+=luvut;
        }
        return summa;
    }
}
