public class PalindrominTunnistus {

    public static void main(String[] args) {
        // voit testata toteutuksesi toimintaa täällä
        System.out.println(onPalindromi("a man, a plan, a canal: Panama")); // true
        System.out.println(onPalindromi("not a bird, not a plane, superman!")); // false
        System.out.println(onPalindromi("saippuakauppias")); // true
        System.out.println(onPalindromi("porkkanakauppias")); // false
        System.out.println(onPalindromi("tässäpä pari 1234"));
        System.out.println(onPalindromi("1 23 4?!  *!)%  (¤5 4321   "));
//        System.out.println(kaanna("tässä on paljon merkkejä"));
//        for (char x='a'; x<='z';x++){
//            System.out.println(x);
//        }
    }

    public static boolean onPalindromi(String merkkijono) {
        // toteuta metodi tänne
        String pienennetty = merkkijono.toLowerCase();
        String trimmattu = pienennetty.trim();
        String jono="";
        for (int i=trimmattu.length()-1;i>=0;i--){
            char ch = trimmattu.charAt(i);
            if (onkoAakkonen(ch)){
                jono+=ch;
            }
        }
        String kaannetty = kaanna(jono);
        if (jono.equals(kaannetty)){
            return true;
        }
        return false;
    }
    
    public static String kaanna(String kaannettava){
        String kaannetty="";
        for (int i=kaannettava.length()-1;i>=0;i--){
            char ch = kaannettava.charAt(i);
            kaannetty=kaannetty+ch;
        }
        return kaannetty;
    }
    
    public static boolean onkoAakkonen(char ch){
        for (int i=0; i<10;i++){
            if (ch==i){
                return true;
            }
        }
        for (char x='a'; x<='z';x++){
            if (ch==x){
                return true;
            }
        }
        return false;
    }
}
