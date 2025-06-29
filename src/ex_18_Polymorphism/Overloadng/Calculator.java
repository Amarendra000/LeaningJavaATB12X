package ex_18_Polymorphism.Overloadng;


 class Calculator {

    void multiply(int a,int b){
        System.out.println("Multiply of 2->"+ (a*b));
    }
    void multiply(int a,int b,int c){
        System.out.println("Multiply of 3->"+ (a*b*c));
    }
    void multiply(double a,double b){
        System.out.println("Multiply of double->"+(a*b));
    }
}
 class Test{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.multiply(2,3);
        c1.multiply(3,5,6);
        c1.multiply(2,789);

    }
}