package ex_07_For_Loop;

public class NaturalNum_Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0; i<=100; i++){
            sum = sum + i;
        }
        System.out.println("Sum of Natural Number is: " + sum);
    }
}
