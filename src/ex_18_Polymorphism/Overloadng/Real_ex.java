package ex_18_Polymorphism.Overloadng;

public class Real_ex {
    public static void main(String[] args) {
        TC_Chrome t = new TC_Chrome();
        t.chrome();
    }
}

     class CommonToAll{
        void chrome(){
            System.out.println("Open the browser");
        }
    }
    class TC_Chrome extends CommonToAll{
        void chrome(){
            System.out.println("Run the browser");
        }
    }

