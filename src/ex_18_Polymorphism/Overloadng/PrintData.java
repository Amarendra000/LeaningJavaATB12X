package ex_18_Polymorphism.Overloadng;

public class PrintData {
    void print(int a){
        System.out.println("interger->"+a);
    }
    void print(String b){
        System.out.println("String->"+b);
    }
    void print(double d){
        System.out.println("Double->"+d);
    }
}
class data{
    public static void main(String[] args) {
        PrintData D=new PrintData();
        D.print(4);
        D.print("Amar");
        D.print(254366.7);
    }
}
