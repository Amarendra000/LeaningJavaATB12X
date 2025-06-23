package ex_17_OOPs_COncept;

 class Amarendra {

     String name;
     String address;
     int height;

     Amarendra(String n, String a, int h){
         name=n;
         address=a;
         height=h;
     }
     void display(){
         System.out.println("Name->"+ name);
         System.out.println("Address->"+address);
         System.out.println("Height->"+ height);
     }

     void walk (){
         System.out.println("He can walk-");
     }
     void work(){
         System.out.println("He can Work");
     }
     Amarendra(){
         System.out.println("He can sleep");
     }
}
