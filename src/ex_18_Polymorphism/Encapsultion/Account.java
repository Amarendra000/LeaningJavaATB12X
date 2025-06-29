package ex_18_Polymorphism.Encapsultion;

public class Account {
    private String accNumber;
    private String holderName;
    private double balance;

    public String getAccNumber() {
        return accNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String accNumber, String holderName, double balance) {
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

        //Deposit
        void Deposit ( double amount){
            if (amount > 0) {
                balance = balance + amount;
                System.out.println(amount + " Deposited Succesfully");
            } else {
                System.out.println("Invalid Amount");
            }
        }

        //withdrawal
        void Withdrawl ( double amount){
            if (amount > 0 && amount < balance) {
                balance = balance - amount;
                System.out.println(amount + " Withdrawl Succesfully");
            } else {
                System.out.println("Invalid amount");
            }
        }


    }
class AccountTest{
    public static void main(String[] args) {
        Account ac=new Account("12345","Amar",50000);
        System.out.println("Account num: "+ ac.getAccNumber());
        System.out.println("Account holder: "+ ac.getHolderName());
        System.out.println("Account balance: "+ ac.getBalance());

        ac.Deposit(2000);
        ac.Withdrawl(5000);
        System.out.println("Updated Balance "+ac.getBalance());
    }
}

