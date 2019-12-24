package day20;

public class ReversingAString {

    public static void main(String[] args) {

        // given a string variable name with value
        // reverse this name and store the reversed value intro
        // another String variable reversedName
         //            01234567
        String name = "Jon Snow";
        String reversedName ;

        System.out.println( name.charAt(7));
        System.out.println( name.charAt(6));
        System.out.println( name.charAt(5));
        System.out.println( name.charAt(4));
        System.out.println( name.charAt(3));
        System.out.println( name.charAt(2));
        System.out.println( name.charAt(1));
        System.out.println( name.charAt(0));

        for (int x = 7; x >=0 ; x--) {
            System.out.print(x + " index : ");
            System.out.println(name.charAt(x));
        }





    }
}
