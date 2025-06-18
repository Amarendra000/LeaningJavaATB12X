package ex_05_Task19_May;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangle_based_on_angle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Angle1");
        int Angle1 = scanner.nextInt();
        System.out.println("Enter Angle2");
        int Angle2 = scanner.nextInt();
        System.out.println("Enter Angle3");
        int Angle3 = scanner.nextInt();

        if (Angle1 == 90 || Angle2 == 90 || Angle3 == 90) {
            System.out.println("It is Right Angled Triangle");}
        else if (Angle1 >90 || Angle2>90|| Angle3>90) {
            System.out.println("It is Obtuse AngledTriangle");}
        else {
            System.out.println("It is Actue Angled Triangle");
        }
    }
}


