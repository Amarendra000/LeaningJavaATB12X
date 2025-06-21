package ex_06_Switch_Cases;

import java.util.Locale;
import java.util.Scanner;

public class ex_02_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade of student");
        String grade = scanner.next().toUpperCase();

        switch (grade){
            case ("A"):
                System.out.println("Excellent,keep it up");
                break;
            case ("F"):
                System.out.println("Need improvment");
                break;
            default:
                System.out.println("Please enter corret grade");
        }
    }
}
