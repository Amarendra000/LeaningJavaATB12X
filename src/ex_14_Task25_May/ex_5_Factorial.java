package ex_14_Task25_May;

import java.util.Scanner;

public class ex_5_Factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        long factorial = 1;

        if (num<0){
            throw new IllegalArgumentException("Not Defined");
        }

        for (int i=1; i<=num; i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of " + num +" is "+factorial);

    }
}
