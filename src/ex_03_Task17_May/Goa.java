package ex_03_Task17_May;

import java.util.Scanner;

public class Goa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc .nextInt();
        String result = age<18? "You Can't Go To Goa" : (age<25? "can go Goa but can't drink" :"Can go Goa and drink also");
        System.out.println(result);

    }
}

