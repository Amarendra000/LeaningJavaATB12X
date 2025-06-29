package ex_20_Abstraction;

abstract class parent {
    abstract void show();

    void display(){
        System.out.println("Concrete method in abstract class");
    }
}
class child extends parent{
    void show(){
        System.out.println("Abstract method implemented");
    }
}
class chidTest{
    public static void main(String[] args) {
        child ch=new child();
        ch.display();
        ch.show();
    }
}