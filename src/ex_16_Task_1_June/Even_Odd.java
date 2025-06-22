package ex_16_Task_1_June;

public class Even_Odd {
    public static void main(String[] args) {
        int[] num = {12,9,8,7,15,18};

        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                System.out.println("Even number"+num[i]);
             }
            }
        for(int number:num){
            if(number%2!=0){
                System.out.println("Odd Number"+number);
            }

        }
    }
}
