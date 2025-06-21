package ex_11_String;

public class ex_04 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.reverse();
        System.out.println(sb);

        String s= "Java";
        char c = s.charAt(2);
        // Index = 0, ->
        System.out.println(c);

        System.out.println(s.codePointAt(0));





    }
}
