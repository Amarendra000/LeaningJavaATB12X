package ex_17_OOPs_COncept;

 class ex_Father {
     void house() {
         System.out.println("Father's House");
     }

     void car() {
         System.out.println("Father's Car");
     }
 }
      class Son extends ex_Father {
         void bike(){
             System.out.println("Son's Bike");
         }
     }
     class Inhertence{
         public static void main(String[] args) {
             Son Amar= new Son();
             Amar.bike();
             Amar.car();
             Amar.house();
         }
     }

