package ex_18_Polymorphism.Overriding;

public class Animal {
    void eat(){
        System.out.println("Animals Eat");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eat meat");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cat eat rat");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("Cow eat grass");
    }
}

class Test{
    public static void main(String[] args) {
        Animal a;
        a=new Cow();
        a.eat();
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();

    }
}