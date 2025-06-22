package ex_15_Array;

public class ex_5_2nd_Highest {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 68, 75, 32};

        int highest = 0;
        int secondhighest = 0;

        for (int i =0; i<numbers.length;i++){
            if (numbers[i]>highest){
                secondhighest=highest;
                highest= numbers[i];
            }

        }
        System.out.println(secondhighest);
    }
}
