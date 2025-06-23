package ex_17_OOPs_COncept;

   class Book {
     String title;
     String author;
     int price;

     Book(String title,String author,int price) {
         this.title = title;
         this.author = author;
         this.price = price;
     }
        void display(){
             System.out.println("Title->" + title + " Autho->" + author + " Price->" + price);
         }
     }
      class Main{
             public static void main(String[] args) {
                 Book b1 = new Book("Science","Amar",159);
                 Book b2 = new Book("Maths","Rishu",105);

                 b1.display();
                 b2.display();


             }
         }


