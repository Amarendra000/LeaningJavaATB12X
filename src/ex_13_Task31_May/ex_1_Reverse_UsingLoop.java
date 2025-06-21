package ex_13_Task31_May;

public class ex_1_Reverse_UsingLoop {
    public static void main(String[] args) {
        String original = "Amarendra";
        String reversed = "";

        for (int i = original.length()-1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        System.out.println("Original String ->" + original);
        System.out.println("Reversed string ->" + reversed);

    }
}
