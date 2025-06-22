package ex_15_Array;

public class ex_1_Max_Min {
    public static void main(String[] args) {
        int[] array = {52, 35, 24, 78, 68, 95};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
            System.out.println("Max is ->" + max);
            System.out.println("Min is ->" + min);

        }
    }

