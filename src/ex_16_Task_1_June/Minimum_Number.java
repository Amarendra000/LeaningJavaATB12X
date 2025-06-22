package ex_16_Task_1_June;

public class Minimum_Number {
    public static void main(String[] args) {

        int[] number = {15,35,10,8,65};
        int min = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i]<min){
                min=number[i];
            }

        }
        System.out.println("Minimum number ->"+ min);
    }
}
