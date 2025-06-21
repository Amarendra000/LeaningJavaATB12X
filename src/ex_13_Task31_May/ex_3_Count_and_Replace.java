package ex_13_Task31_May;

public class ex_3_Count_and_Replace {
    public static void main(String[] args) {

        String sb = "Amarendra      Kumar     Yadav   ";
        sb = sb.trim().replaceAll("\\s+"," ");
        //System.out.println(sb);
        String[] words = sb.split(" ");
        //System.out.println(words);
        int wordCount = words.length;

        System.out.println(wordCount);
    }

}
