package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

     // indexOf --->
        // find out index of another String inside this String
        String name = "Game of Java";
        // find out the location of Java
        // find out the location of letter 0
        // find out the location of first space
        // if location is not found we get minus number

        System.out.println("Find out the location of Java");
        System.out.println( name.indexOf("Java"));

        System.out.println("Find out the location of o");
        System.out.println( name.indexOf("o"));

        System.out.println("Find out the location of 0");
        System.out.println( name.indexOf("0"));

        System.out.println("Find out the location of first space ");
        System.out.println( name.indexOf(" "));



    }
}
