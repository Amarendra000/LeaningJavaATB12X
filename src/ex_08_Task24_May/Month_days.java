package ex_08_Task24_May;

import java.util.Scanner;

public class Month_days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter the Month's number");
        int month = scanner.nextInt();
        System.out.println("Enter the Year");
        int year = scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month"+(month) + " Number of days = 31 " + "Year" + (year) );

                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month"+(month) + " Number of days = 30 " + "Year" + (year));
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println("29 Days," + year + " (Leap Year)");}
                else {
                    System.out.println("28 Days,"  + year + " (Common Year)");
                }
            default:
                System.out.println("Invalid Input");



        }
    }
}
