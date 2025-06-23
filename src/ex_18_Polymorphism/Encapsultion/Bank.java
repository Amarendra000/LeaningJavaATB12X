package ex_18_Polymorphism.Encapsultion;

public class Bank {
    public static void main(String[] args) {
        ICICIBank amit= new ICICIBank("Amit",100);
        System.out.println(amit.isBal());

        boolean isCashier=true;
        amit.setBal(1000,isCashier);
        System.out.println(amit.isBal());

    }

}

    class ICICIBank{
       private String name;
       private int bal;
        String bank= "ICICI";

        public ICICIBank(String name,int bal) {
            this.name = name;
            this.bal=bal;
        }

        public int isBal() {
            return bal;
        }

        public void setBal(int bal,boolean isCashier) {
            if (isCashier){
                this.bal=bal;
                }else{
                System.out.println("Not Allowed");
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
