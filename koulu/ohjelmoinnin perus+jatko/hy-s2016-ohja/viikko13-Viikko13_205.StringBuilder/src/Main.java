import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(muotoile(t));
    }

    public static String muotoile(int[] t) {
        StringBuilder builder = new StringBuilder("{\n");
        for (int i=0; i<t.length;i++){
            builder.append(" ").append(t[i]);
            if (i!=t.length-1){
                builder.append(",");
            }
            if ((i+1)%4==0|i==t.length-1){
                builder.append("\n");
            }
        }
        builder.append("}");
        return ""+builder;
    }
}
