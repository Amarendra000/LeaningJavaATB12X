package ex_17_OOPs_COncept;

public class DogObject {
    public static void main(String[] args) {
        Dog D =new Dog();
        D.sound();
        D.DogSound();
    }


}

class Animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    void DogSound(){
        System.out.println("Dog Barks");
    }
}
