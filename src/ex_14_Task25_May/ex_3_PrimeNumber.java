package ex_14_Task25_May;

import java.util.Scanner;

public class ex_3_PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }else {
            for (int i=2; i<=num/2; i++){
                if (num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(num + " is a Prime Number.");
            else
                System.out.println(num + " is Not a Prime Number.");
        }

    }
}
