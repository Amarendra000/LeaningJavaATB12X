package ex_08_Task24_May;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        long factorial = 1;

        if (num<0){
            throw new IllegalArgumentException("Not Defined for Negative numbers");
        } else if (num==0 || num==1) {
            System.out.println("FActorial is 1");

        }

        for (int i = 1; i<= num; i++){
            factorial = factorial*i ; // facttorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);

    }
}
