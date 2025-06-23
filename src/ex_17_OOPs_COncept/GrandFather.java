package ex_17_OOPs_COncept;

class GrandFather {
    void farm(){
        System.out.println("GrandFather's Farm");
    }
}
class father extends GrandFather{
    void house (){
        System.out.println("Father's house");
    }
}
class child extends father{
    void bike(){
        System.out.println("Child's Bike");
    }
}
class Inherit{
    public static void main(String[] args) {
       child ram= new child();

       ram.farm();
       ram.house();
        ram.bike();

    }
}

