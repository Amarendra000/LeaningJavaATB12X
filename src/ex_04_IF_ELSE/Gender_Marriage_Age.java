package ex_04_IF_ELSE;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Gender_Marriage_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the gender");
        String gen = scanner.nextLine();
        if (gen.equals("Male")) {
            if (age >= 21) {
                System.out.println("You are eligible for marriage");
            } else {
                System.out.println("You are not eligible for  marriage");
            }

        } else if (gen.equals("Female")) {
            if (age >= 18) {
                System.out.println("You are elible for marrage");
            } else {
                System.out.println("Not eligible for marriage");
           }

        }
    }
}
//        if(gen=="male")
//        {
//
//            if(age>=21)
//            {
//                System.out.println("Male is eligible for marriage becz age is:"+age);
//            }
//            else
//            {
//                System.out.println("Male is not  eligible for marriage becz age is:"+age);
//            }
//        }
//
//else if(gen=="female")
//        {
//            if(age>=18)
//            {
//                System.out.println("female is eligible for marriage becz age is:"+age);
//            }
//            else
//            {
//                System.out.println("female is not  eligible for marriage becz age is:"+age);
//            }
//        }
//        else
//        {
//
//            System.out.println("Not eligible for marriage becz gen is NNN:");
//        }
//    }
//
//}