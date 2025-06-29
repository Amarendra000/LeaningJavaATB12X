package ex_20_Abstraction;

abstract class Animals {
    abstract void sound();
}
class Dog extends Animals{
    void  sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animals{
    void sound(){
        System.out.println("Cat Meows");
    }
}
class AnimalTest{
    public static void main(String[] args) {
        Animals a;
        a=new Dog();
        a.sound();
        a=new Cat();
        a.sound();
    }
}