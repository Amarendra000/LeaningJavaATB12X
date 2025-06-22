package ex_15_Array;

public class ex_4_Sum {
    public static void main(String[] args) {
         int[] num = {12,56,42};
         int sum = 0;
        for (int i = 0; i < num.length ; i++) {
            sum = sum + num[i];

        }
        System.out.println(sum);
    }
}
