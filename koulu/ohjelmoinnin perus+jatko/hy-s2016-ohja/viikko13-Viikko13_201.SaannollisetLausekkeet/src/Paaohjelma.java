
public class Paaohjelma {


    public static void main(String[] args) {
        
    }
    
    public static boolean onViikonpaiva(String merkkijono){
        return merkkijono.matches("ma|ti|ke|to|pe|la|su");
    }
    
    public static boolean kaikkiVokaaleja(String merkkijono){
        return merkkijono.matches("[a|e|i|o|u|y|ä|ö]*");
    }
    
    public static boolean kellonaika(String merkkijono){
        return merkkijono.matches("(2[0-3]|[0-1][0-9]):[0-5][0-9]:[0-5][0-9]");
    }
}
