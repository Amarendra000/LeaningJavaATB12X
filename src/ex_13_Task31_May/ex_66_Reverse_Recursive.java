package ex_13_Task31_May;

public class ex_66_Reverse_Recursive {
    public static String reverse (String str){
        if (str.isEmpty())
            return str;
            return reverse(str.substring(1)) + str.charAt(0);

    }
    public static void main(String[] args) {
            String input = "Amarendra";
            String result = reverse(input);
            System.out.println("Reversed string: " + result);
    }

}
