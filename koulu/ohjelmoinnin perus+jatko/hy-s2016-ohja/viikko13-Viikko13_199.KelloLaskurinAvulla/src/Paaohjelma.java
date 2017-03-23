import java.util.Scanner;

//public class Paaohjelma {
//    public static void main(String[] args)  {
//        Scanner lukija = new Scanner(System.in);
//        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
//        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
//        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);
//
//        System.out.print("sekunnit: ");
//        int sek = Integer.parseInt(lukija.nextLine());
//        System.out.print("minuutit: ");
//        int min = Integer.parseInt(lukija.nextLine());
//        System.out.print("tunnit: ");
//        int tun = Integer.parseInt(lukija.nextLine());
//
//        sekunnit.asetaArvo(sek);
//        minuutit.asetaArvo(min);
//        tunnit.asetaArvo(tun);
//
//        int i = 0;
//        while (i < 121) {
//            System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);
//            sekunnit.seuraava();
//            if (sekunnit.arvo()==0){
//                minuutit.seuraava();
//                if (minuutit.arvo()==0){
//                    tunnit.seuraava();
//                }
//            }
//            i++;
//        }
//
//    }
//}
public class Paaohjelma {
    public static void main(String[] args) throws Exception {
        YlhaaltaRajoitettuLaskuri sekunnit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri minuutit = new YlhaaltaRajoitettuLaskuri(59);
        YlhaaltaRajoitettuLaskuri tunnit = new YlhaaltaRajoitettuLaskuri(23);

        sekunnit.asetaArvo(50);
        minuutit.asetaArvo(59);
        tunnit.asetaArvo(23);

        while (true) {
            System.out.println(tunnit + ":" + minuutit + ":" + sekunnit);
            Thread.sleep(1000);
            sekunnit.seuraava();
            if (sekunnit.arvo()==0){
                minuutit.seuraava();
                if (minuutit.arvo()==0){
                    tunnit.seuraava();
                }
            }
        }
    }
}