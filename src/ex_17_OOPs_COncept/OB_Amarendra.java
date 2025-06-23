package ex_17_OOPs_COncept;

public class OB_Amarendra {
    public static void main(String[] args) {

        Amarendra person = new Amarendra("Amar","Rampur",6);
        Amarendra person2 = new Amarendra("Omar","Jampur",5);
//        person.height=6;
//        person.address="Noida";
//        person.name="Amar";

        person.walk();
        person.work();
        person.display();
        person2.display();

    }
}
