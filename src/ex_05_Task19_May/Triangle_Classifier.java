package ex_05_Task19_May;

import ex_04_IF_ELSE.If_cond;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1:");
        int side1 = scanner.nextInt();
        System.out.println("Enter side2:");
        int side2 = scanner.nextInt();
        System.out.println("Enter side3:");
        int side3 = scanner.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral triangle");}
        else if (side1 == side2 || side3 == side1 || side3 == side2) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");

            }
        }

    }

