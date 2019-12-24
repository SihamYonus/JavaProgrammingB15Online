package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {
    // given a String with even number character count
    // print 2 characters in one line as below example
        /*
        Ay  01
        yr  12
        ra  34
         */

        String name = "Ayra";
        int lastCharIndex = name.length()-1;

        System.out.println( name.substring(0,2));
        System.out.println( name.substring(1,3));
        System.out.println( name.substring(2,4));

        System.out.println("---------------------");

        for (int x = 0; x <= lastCharIndex-2 ; x++) {
            System.out.println( name.substring(x,x+2));
        }

        // For example : Ayra   Ayr--->> 012 yra--->>123
        System.out.println("GETTING 3 CHARACTER");

        for (int x = 0; x <= lastCharIndex-2 ; x++) {
            System.out.println( name.substring(x,x+3));
        }


    }
}
