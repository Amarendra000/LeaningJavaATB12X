package ex_13_Task31_May;

public class ex_4_Palindrome {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("RAMAR");
        System.out.println("String sb1->" + sb1);

        StringBuffer sb2 = new StringBuffer(sb1);
        sb2 = sb1.reverse();
        System.out.println("Stringsb2->" + sb2);

        if (sb1.toString().equals(sb2.toString())){
            System.out.println("It's a Palindrome");
        }else {
            System.out.println("It's  not Palindrome");
        }



    }
}
