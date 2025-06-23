package ex_18_Polymorphism.Overloadng;

public class MathOperation {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

}
 class method_overloading {
    public static void main(String[] args) {
        MathOperation m1= new MathOperation();
      int s1= m1.add(3,4);
        System.out.println(s1);
       int s2=m1.add(3,4,6);
        System.out.println(s2);
    }
}