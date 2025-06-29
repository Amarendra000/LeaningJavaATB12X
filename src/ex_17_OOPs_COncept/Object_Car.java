package ex_17_OOPs_COncept;

public class Object_Car {
    public static void main(String[] args) {

        Class_Car mycar = new Class_Car("Red");
        //mycar.color="Red";
        mycar.Brand="Mahindra";
        mycar.engine="XXX";

        mycar.run();
        mycar.stop();
        mycar.display();


    }
}
