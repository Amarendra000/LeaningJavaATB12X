package ex_16_Task_1_June;

public class LargestNum {
    public static void main(String[] args) {

        int[] num = {10,25,35,16,79};
        int largest=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("largest Number ->" + largest);
    }
}
