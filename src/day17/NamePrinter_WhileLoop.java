package day17;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {

        // last character from index 0 till last index ( name.lenght()-1
        String name = "Alexander";

        int x = 0;

        while (x < name.length()) {

            System.out.print("index" + x + " : ");
            System.out.println(name.charAt(x));
            ++x;

        }

        System.out.println("-------------------");

        // My name in reverse

        String myName = "Siham Yasin";

        //int lastCharacterIndex = name.length()-1;
        int y = myName.length()-1;


        while (y >= 0 ){
            System.out.println("index" + y + " : " + myName.charAt(y));
            --y;

        }
    }
}
