package ex_20_Abstraction;

abstract class Bank {
    abstract void getIntrestRate();

    }
class SBI extends Bank{
    void getIntrestRate(){
        System.out.println("SBI Interest Rate: 6.5%");
    }
}
class HDFC extends Bank{
    void getIntrestRate(){
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}
class BankTest{
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        b.getIntrestRate();
        b=new HDFC();
        b.getIntrestRate();
    }
}
