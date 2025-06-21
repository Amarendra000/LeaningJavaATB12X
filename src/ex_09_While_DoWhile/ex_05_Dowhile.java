package ex_09_While_DoWhile;

import java.util.Scanner;

public class ex_05_Dowhile {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int num;
        int attempt = 0;

        do {
            System.out.println("Enter 0 to exit");
            num = scanner.nextInt();
            attempt++;
        }while (num != 0);
        System.out.println("Exit "+ "in "+ attempt +" attempt");
    }
}
