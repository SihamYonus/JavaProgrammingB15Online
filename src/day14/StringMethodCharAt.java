package day14;

public class StringMethodCharAt {

    public static void main(String[] args) {

        //charAt method of String
        //it will return a character at certain location specified
        String aName = "Ayra";
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);

        // A r y a
        System.out.println(c1 + " "+ c2 + " "+ c3 + " "+ c4 );

        System.out.println("---------------");

        String name = "Siham";

        System.out.println( name.charAt(0) + " ");
        System.out.println( name.charAt(1) + " ");
        System.out.println( name.charAt(2) + " ");
        System.out.println( name.charAt(3) + " ");
        System.out.println( name.charAt(4) + " ");

        System.out.println("--------------");

        System.out.println( name.charAt(0) + " ");
        System.out.println( name.charAt(1) + " ");
        System.out.println( name.charAt(2) + " ");
        System.out.println( name.charAt(3) + " ");
        System.out.println( name.charAt(4) + " ");


    }
}