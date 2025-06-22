package ex_16_Task_1_June;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int[] number = {15, 25, 35, 78, 4};
        for (int i = number.length-1; i >= 0; i--) {
            System.out.print(number[i]+ " ");
        }
    }
}