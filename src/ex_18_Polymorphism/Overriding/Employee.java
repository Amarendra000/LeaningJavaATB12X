package ex_18_Polymorphism.Overriding;

public class Employee {
    void salary(){
        System.out.println("Salary");
    }
}
class Developer extends Employee{
    void salary(){
        System.out.println("Dev sal->"+50000);
    }
}
class Manager extends Employee{
    void salary(){
        System.out.println("Man Sal->"+80000);
    }
}
class Salary{
    public static void main(String[] args) {
        Employee s;
        s=new Developer();
        s.salary();
        s= new Manager();
        s.salary();
    }
}
