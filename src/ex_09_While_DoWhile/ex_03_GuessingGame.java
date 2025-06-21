package ex_09_While_DoWhile;

import java.util.Random;
import java.util.Scanner;


public class ex_03_GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int numberTOGuess = random.nextInt( 100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;

        while (true){

            if (!scanner.hasNextInt()){
                System.out.println("Invalid Input");
                scanner.next();
                continue;
            }
              guess = scanner.nextInt();
              attempts++;


            if (guess < numberTOGuess) {
                System.out.println("To low,Try Again");
            } else if (guess>numberTOGuess) {
                System.out.println("To high, Try Again");
            }
            else {
                System.out.println("BINGO,You Found Correct ->" + attempts +"attempt");
            }
        }


    }
}
