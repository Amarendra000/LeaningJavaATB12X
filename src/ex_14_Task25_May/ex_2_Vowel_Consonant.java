package ex_14_Task25_May;

import java.util.Scanner;

public class ex_2_Vowel_Consonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.next();
        str =str.toLowerCase();
        int vowel = 0;
        int consonant = 0;

        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i);

            if (Character.isLetter(ch)){
                if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                    vowel++;
                }else {
                    consonant++;
                }
            }

        }
        System.out.println("Vowels-> " + vowel);
        System.out.println(("Consonant-> "+ consonant));





    }
}
