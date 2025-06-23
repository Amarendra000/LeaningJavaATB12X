package ex_17_OOPs_COncept;

 class Students {
     String name;
     int Roll_no;
     int marks;

     Students(String n, int r, int m) {
         name = n;
         Roll_no = r;
         marks = m;
     }

     void display() {
         System.out.println("Name->" + name + " Roll_no-> " + Roll_no+" Marks-> " + marks);
     }
 }

    class St {
         public static void main(String[] args) {
             Students S1 = new Students("Amar", 12, 85);
             Students s2 = new Students("Ram", 9, 95);
             Students s3 = new Students("Jam", 7, 75);

             S1.display();
             s2.display();
             s3.display();


         }
     }

