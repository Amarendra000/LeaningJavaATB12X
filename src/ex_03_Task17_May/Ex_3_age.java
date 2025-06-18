package ex_03_Task17_May;

public class Ex_3_age {
    public static void main(String[] args) {
        int age =68;
        String result = age < 18? "Minor" : (age<65? "Adult" : "Senior");
        System.out.println(result);

    }
}
