package ex_21_Interface;

interface Speedlimit {
    int MAX_SPEED =120;
}
class Car implements Speedlimit{
     void speed(){
        System.out.println("Max Speed"+MAX_SPEED);
    }
}
class Test{
    public static void main(String[] args) {
        Car c=new Car();
        c.speed();
    }
}
