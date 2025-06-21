package ex_06_Switch_Cases;

import java.util.Scanner;

public class ex_05_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Month's Number");
        int num = scanner.nextInt();

        switch (num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days = 31");
               break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days = 30");
                break;
            case 2:
                System.out.println("Number of days =28");
                break;
            default:
                System.out.println("Invalid Input");



        }
    }
}
