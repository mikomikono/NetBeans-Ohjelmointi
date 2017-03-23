public class StringUtils {
    
    public static boolean sisaltaa(String sana, String haettava){
        if (sana.isEmpty()|haettava.isEmpty()){
            return false;
        }
        sana=sana.toLowerCase();
        haettava=haettava.toLowerCase();
        sana=sana.trim();
        haettava=haettava.trim();
        if (sana.contains(haettava)){
            return true;
        }
        return false;
    }
}
