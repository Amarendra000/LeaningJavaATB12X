package ex_04_IF_ELSE;

import java.util.Scanner;

public class Greatest_among_3_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2");
        int num2 = scanner.nextInt();
        System.out.println("Enter num3");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > 3) {
            System.out.println("Greatest Number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Greatest Number is: " + num2);
        } else {
            System.out.println("Greatest Number is: " + num3);
        }
    }
}