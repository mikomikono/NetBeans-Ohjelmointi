import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
//        int[] taulukko = {3, 1, 5, 99, 3, 12};
//        System.out.println("pienin: " + pienin(taulukko));
//        System.out.println("pienimmän indeksi: "+pienimmanIndeksi(taulukko));
// indeksit:    0  1  2  3   4
//        int[] luvut = {-1, 6, 9, 8, 12};
//        System.out.println(pienimmanIndeksiAlkaen(luvut, 1));
//        System.out.println(pienimmanIndeksiAlkaen(luvut, 2));
//        System.out.println(pienimmanIndeksiAlkaen(luvut, 4));
//int[] luvut = {3, 2, 5, 4, 8};
//
//System.out.println(Arrays.toString(luvut));
//
//vaihda(luvut, 1, 0);
//System.out.println(Arrays.toString(luvut));
//
//vaihda(luvut, 0, 3);
//System.out.println(Arrays.toString(luvut));
//int[] luvut = {8, 3, 7, 9, 1, 2, 4};
//System.out.println(Arrays.toString(luvut));
//jarjesta(luvut);
    }
    
    public static int pienin(int[] taulukko){
        int pienin=taulukko[0];
        for (int luku:taulukko){
            if(luku<pienin){
                pienin=luku;
            }
        }
        return pienin;
    }
    
    public static int pienimmanIndeksi(int[] taulukko){
        int indeksi=0;
        int pienin=taulukko[0];
        int i=0;
        for (int luku:taulukko){
            if (luku<pienin){
                pienin=luku;
                indeksi=i;
            }
            i++;
        }
        return indeksi;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi){
        int pienin=taulukko[aloitusIndeksi];
        int i=0;
        for (int luku:taulukko){
            if (i>=aloitusIndeksi&&luku<pienin){
                pienin=luku;
                aloitusIndeksi=i;
            }
            i++;
        }
        return aloitusIndeksi;
    }
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2){
        int vali=taulukko[indeksi1];
        taulukko[indeksi1]=taulukko[indeksi2];
        taulukko[indeksi2]=vali;
    }
    
    public static void jarjesta(int[] taulukko){
        for (int i=0; i<taulukko.length;i++){
            vaihda(taulukko, i, pienimmanIndeksiAlkaen(taulukko, i));
            System.out.println(Arrays.toString(taulukko));
        }
    }
    
}
