package ex_16_Task_1_June;

public class Sum_Of_Array {
    public static void main(String[] args) {
        int[] num = {10,25,5,8,6};
        int sum=0;

        for(int i=0; i<num.length;i++){
            sum= sum+num[i];
        }
        System.out.println("Sum of Array ->"+ sum);
    }
}
