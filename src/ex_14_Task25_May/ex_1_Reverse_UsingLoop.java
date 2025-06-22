package ex_14_Task25_May;

public class ex_1_Reverse_UsingLoop {
    public static void main(String[] args) {

        int num = 12345;
        int reverse = 0;

        for (; num!=0; num /=10){
           int digit = num%10;
           reverse = reverse*10 + digit;
        }System.out.print("reverse of num: " + reverse);
    }
}
