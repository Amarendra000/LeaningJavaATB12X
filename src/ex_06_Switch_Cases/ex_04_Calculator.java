package ex_06_Switch_Cases;

import java.util.Scanner;

public class ex_04_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number1");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the Number2");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the Operator");
        char op = scanner.next().charAt(0);

        switch (op){
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + '-' + num2 + '=' + (num1-num2) );
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + '/' + num2 + '=' + (num1/num2) );
                break;

            case '%':
                System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
                break;
            default:
                System.out.println("Please valid Opretors");

        }

    }
}
