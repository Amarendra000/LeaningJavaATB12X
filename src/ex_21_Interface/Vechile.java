package ex_21_Interface;

interface Vechile {
    default void start(){
        System.out.println("Vechile Started");
    }
    static void fueltype(){
        System.out.println("Fuel type is petrol");
    }
}
class car implements Vechile{

}
class Main{
    public static void main(String[] args) {
        car c=new car();
        c.start();
        Vechile.fueltype();
    }
}