package ex_15_Array;

import java.util.Arrays;

public class ex_8_2nd_Highest_Sorting {
    public static void main(String[] args) {
        int[] num={45,21,65,7,25,64};
        Arrays.sort(num);

        System.out.println("2nd Largest num->"+ num[num.length-2]);
        System.out.println("2nd Smallest num->"+ num[1]);
    }
}
