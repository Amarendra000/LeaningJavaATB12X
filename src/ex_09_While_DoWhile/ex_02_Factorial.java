package ex_09_While_DoWhile;

import java.util.Scanner;

public class ex_02_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        long factorial  = 1;
        int i=1;


        if (num<0){
            throw new IllegalArgumentException("Not Defined for Negative numbers");
        } else if (num==0 || num==1) {
            System.out.println("FActorial is 1");

        }


        while (i<=num){
            factorial=factorial*i;
            i++;
        }
        System.out.println("Factorial is"+ factorial);
    }
}
