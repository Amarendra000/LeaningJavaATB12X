package ex_21_Interface;

interface Printable {
    void print();
}
interface Showable{
    void show();
}
class Document implements Printable,Showable{
   public void print(){
        System.out.println("Printing Document");
    }
    public void show(){
        System.out.println("Showing Document");
    }
}
class test{
    public static void main(String[] args) {
        Document d=new Document();
        d.print();
        d.show();
    }
}
