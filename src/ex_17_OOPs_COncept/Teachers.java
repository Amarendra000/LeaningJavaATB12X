package ex_17_OOPs_COncept;
 public class Teachers {
    public static void main(String[] args) {
        MathTeachers m1 =new MathTeachers("Amar","M.A", 9 );
        MathTeachers m2 = new MathTeachers("Anand","BSc",8);
        m1.display();
        m2.display();
    }

}


class MathTeachers{
    String name;
    int Class;
    String qualification;

    public MathTeachers(String name, String qualification, int Class) {
        this.name=name;
        this.qualification = qualification;
        this.Class=Class;
    }

    void display(){
        System.out.println("Name->"+name+ " Class->"+Class + " Qual->"+qualification);
    }

}