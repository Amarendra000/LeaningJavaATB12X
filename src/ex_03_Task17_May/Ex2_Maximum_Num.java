package ex_03_Task17_May;

public class Ex2_Maximum_Num {
    public static void main(String[] args) {
        int n1= 15;
        int n2 = 25;
        int n3 = 9;
        int maximum = n1>n2 ? ((n1>n3)? n1 : n3) : ((n2>n3)? n2 : n3);
        System.out.println("Maximum number is " + maximum);
    }
}
