package ex_18_Polymorphism.Encapsultion;

import java.util.Scanner;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed");
        } else {
            System.out.println("Incorrect old password");
        }
    }
}
class UserMain{
    public static void main(String[] args) {
        User u=new User("Amar@1999","A123");
        Scanner sc=new Scanner(System.in);
        System.out.println("Username->"+ u.getUsername());

        System.out.println("Enter old password");
        String oldPassword=sc.nextLine();

        System.out.println("Enter New password");
        String newPassword=sc.nextLine();

        u.setPassword(oldPassword,newPassword);

        System.out.print("Try changing password again. Enter old password: ");
        oldPassword = sc.nextLine();
        System.out.print("Enter new password: ");
        newPassword = sc.nextLine();
        u.setPassword(oldPassword, newPassword);



    }
}
