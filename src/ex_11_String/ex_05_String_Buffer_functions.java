package ex_11_String;

public class ex_05_String_Buffer_functions {
    public static void main(String[] args) {

        // Create a String Buffer

        StringBuffer sb = new StringBuffer("Amarendra");
        System.out.println(sb);

        //Append in String
        sb.append("Yadav");
        System.out.println(sb);

        //Insert a text
        sb.insert(14," Hie");
        System.out.println(sb);

        //Replace a text
        sb.replace(15,18,"Bye");
        System.out.println(sb);



    }
}
