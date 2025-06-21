package ex_07_For_Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int original = num;

        int reverse = 0;

        for (; num!=0; num /=10){
            int digit = num%10;
            reverse = reverse*10 + digit;
        }
        if (original == reverse){
            System.out.println("It's a Palindrome");
        }else {
            System.out.println("It's not a Palindrome");
        }
    }
}
