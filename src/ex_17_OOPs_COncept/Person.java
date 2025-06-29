package ex_17_OOPs_COncept;

  class Person {
     String name;
     int age;

     public Person(String name,int age) {
         this.name = name;
         this.age=age;
     }

     void displayDetail(){
         System.out.println("Name-"+name + "\nAge-"+age);
     }
}
class Employee extends Person{
      int salary;

    public Employee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    void displaySalary(){
          System.out.println("Salary-"+salary);

      }

}
 class Employee_Ob {
     public static void main(String[] args) {

         Employee E1 = new Employee("Amar",25,50000);

         E1.displayDetail();
         E1.displaySalary();

     }
 }