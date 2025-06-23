package ex_17_OOPs_COncept;

public class ex_School {
    void bus(){
        System.out.println("School provide bus");
    }
    void Lab(){
        System.out.println("School provide class");
    }
    void Teacher(){
        System.out.println("School provide Teachers");
    }
}
 class Student extends ex_School{
    void Books(){
        System.out.println("My Books");
    }
    void cycle(){
        System.out.println("My cycle");
    }
}
class Student_inheritence{
    public static void main(String[] args) {
        Student amar = new Student();
        amar.Books();
        amar.cycle();
        amar.Teacher();
        amar.bus();
        amar.Lab();

    }
}
