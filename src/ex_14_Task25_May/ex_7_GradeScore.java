package ex_14_Task25_May;

import java.util.Scanner;

public class ex_7_GradeScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("B");
        } else if (marks >= 70 && marks <=79) {
            System.out.println("C");
        } else if (marks >= 60 && marks <=69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}