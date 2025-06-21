package ex_07_For_Loop;

public class Pattern_Printing {
    public static void main(String[] args) {
        int rows = 5;

        for (int i=1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
