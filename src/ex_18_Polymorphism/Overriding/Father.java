package ex_18_Polymorphism.Overriding;

public class Father {
    void home(){
        System.out.println("F-Home");
    }
    void bike(){
        System.out.println("F-bike");
    }
}
 class Pramod extends Father{
    @Override
    void home(){
        System.out.println("P-Home");
    }
}
class OverRide{
    public static void main(String[] args) {
        Pramod p= new Pramod();
        //Father p=new Father();
        p.home();
        p.bike();
    }
}