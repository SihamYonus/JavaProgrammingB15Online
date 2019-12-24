package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

      // checking for String equality should be always
      // done using equals method of the String

      // oneString.equals(anotherString) ----> true or false
      // equals method coming from String class
      // each and every String object you created will have this functionality

      // just comparing 2 string literal directly using equal method
      // This is something that will rarely

        System.out.println("Java".equals("java"));

        String myStr = "Java" ;
        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");

        System.out.println(" is my string name same as your string?");
        // how to compare myStr to yourStr for equality
        System.out.println( myStr.equals( yourStr ));





    }
}
