package ex_15_Array;

import java.util.Scanner;

public class ex_2_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        String[] Number_Marks = new String[size];

        for (int i = 0; i < Number_Marks.length; i++) {
            System.out.println("Enter the element ->" + i);
            Number_Marks[i]= sc.next();
        }
        System.out.println("----Array value----");

        for (int i = 0; i < Number_Marks.length; i++) {
            System.out.println( Number_Marks[i]);
            //Number_Marks[i] = sc.next();
        }
    }
}
