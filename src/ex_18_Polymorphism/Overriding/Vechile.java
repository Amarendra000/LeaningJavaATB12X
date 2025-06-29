package ex_18_Polymorphism.Overriding;

public class Vechile {
    void run(){
        System.out.println("Run thr vechile");
    }
}
class car extends Vechile{
    @Override
    void run(){
        System.out.println("Run the car");
    }
}
class bike extends Vechile{
    @Override
    void run(){
        System.out.println("Run the bike");
    }
}
class Run{
    public static void main(String[] args) {
        bike b= new bike();
        car c=new car();
        b.run();
        c.run();
    }
}