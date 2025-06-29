package ex_18_Polymorphism.Encapsultion;

public class Students {
    private String name;
    private int rollno;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }



    public Students(String name, int rollno, int marks) {
        this.name = name;
        this.rollno=rollno;
        this.marks=marks;



    }
}
class StudentMain{
    public static void main(String[] args) {
        Students s1= new Students("Amar",01,95);

        System.out.println("Student Name->"+ s1.getName());
        System.out.println("Student RollNo->"+s1.getRollno());
        System.out.println("Student Marks->"+ s1.getMarks());

        s1.setMarks(98);
        System.out.println("Student UpdatedMarks->"+ s1.getMarks());
    }
}