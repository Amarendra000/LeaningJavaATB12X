package ex_11_String;

import java.util.Locale;

public class ex_03 {
    public static void main(String[] args) {
        String s1 = "Java";

        int idx = "Java".indexOf("v");
        System.out.println(idx);

        int idx1 = "Java".lastIndexOf("a");
        System.out.println(idx1);

        String s2 = String.join("-", "Java", "Pyhton");
        System.out.println(s2);

        String s3 = "Java".replace('a', 'o');
        System.out.println(s3);

        String s4 = "Java".toLowerCase(Locale.ROOT);
        System.out.println(s4);

        int result = s2.compareToIgnoreCase(s3);
        System.out.println(result );
    }
}
