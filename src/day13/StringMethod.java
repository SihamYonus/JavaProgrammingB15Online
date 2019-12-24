package day13;

public class StringMethod {

    public static void main(String[] args) {

        // String action that we already know so far

        // equals
        String s1 = "hello";
        System.out.println(s1.equals("abc"));
        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));

        // to UpperCase method of String is used to make String all character uppercase
        System.out.println(s1);
        System.out.println(s1.toUpperCase());

        // loLowerCase method of String is used to make String all character lowercase
        System.out.println(s1.toLowerCase());

        // store you name into a variable
        // print your name in all uppercase
           // you may optionally contenate  "MY NAME IS : MYNAME"
        // print your name in all lowercase
           // you may optionally concatenate "my name is : myname"

        String myName = "SIHAM YASIN";

        System.out.println("MY NAME IS :" +myName.toUpperCase());
        System.out.println("my name is :" + myName.toLowerCase());


        // In order to get how many chacter we have inside String
        // We can use lenght method of String

        System.out.println( s1.length() );
        int lenghtOfStr = s1.length();

        if (lenghtOfStr > 4){
            System.out.println("More than 4 characters");
        }else {
            System.out.println("Not more than 4");
        }



    }
}
