package ex_06_Switch_Cases;

import java.util.Scanner;

public class ex_03_cons_vow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().charAt(0);

        if ((ch>='A'&& ch<='Z') || (ch>='a' && ch<='z')) {

            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("This is a Vowel");
                    break;

                default:
                    System.out.println("This  is Consonant");
                    break;
            }
        }else{
            System.out.println("Please enter valid input");
        }

        }
    }


