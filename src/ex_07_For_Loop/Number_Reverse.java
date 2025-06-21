package ex_07_For_Loop;

import java.util.Scanner;

public class Number_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        int reverse = 0;
         for (; num !=0; num/= 10){
             int digit = num%10;
             reverse = reverse*10 + digit;
         }
        System.out.println("Reverse Number: " + reverse);
    }
}
