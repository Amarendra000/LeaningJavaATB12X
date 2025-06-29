package ex_17_OOPs_COncept;

public class Friends {
    String name;
    int age;
    String address;

    void display(){
        System.out.println("Name->" + name);
        System.out.println("Address->" + address);
    }
}

 class Trio{
     public static void main(String[] args) {
         Friends f1= new Friends();
         Friends f2 = new Friends();

         f1.name="Anand";
         f1.address="Nidhariya";
         f2.name="Chandan";
         f2.address="Middha";

         f1.display();
         f2.display();

     }
}
