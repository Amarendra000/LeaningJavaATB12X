package ex_17_OOPs_COncept;

class Class_Car {

    String color;
    String engine;
    String Brand;

    public Class_Car(String color) {
        this.color = color;
    }

    void display(){
        System.out.println("Colour"+color);
    }

    void stop(){
        System.out.println("It can stop");
    }
    void run(){
        System.out.println("It can Accelerate");
    }
}
