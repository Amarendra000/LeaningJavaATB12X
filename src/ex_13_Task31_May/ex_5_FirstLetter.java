package ex_13_Task31_May;

public class ex_5_FirstLetter {
    public static void main(String[] args) {
        String sb = "Amarendra  Kumar   Yadav";
         sb = sb.trim().replaceAll("\\s+"," ");
         String[] words = sb.split(" ");

         for (int i =0; i< words.length; i++) {
             System.out.print(words[i].charAt(0) +" ");
         }
    }
}
