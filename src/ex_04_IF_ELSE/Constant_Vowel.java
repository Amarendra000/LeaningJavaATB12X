package ex_04_IF_ELSE;

import java.util.Scanner;

public class Constant_Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char ch = scanner.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("It is VOWEL");
        }if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("It is VOWEL");}
        else {
            System.out.println("It is CONSONANT");
        }

    }
}
