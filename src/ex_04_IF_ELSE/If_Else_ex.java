package ex_04_IF_ELSE;

import java.util.Scanner;

public class If_Else_ex {
    public static void main(String[] args) {
        System.out.println("Enter Your Age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age>18){
            System.out.println("Allowed to vote");
        }else{
            System.out.println("Not Allowed to vote");
        }
    }
}
