package ex_14_Task25_May;

public class ex_6_FizzBuzz {
    public static void main(String[] args) {
        int i = 1;
        for (i = 1; i <= 100; i++) {
            //System.out.println(i);

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}