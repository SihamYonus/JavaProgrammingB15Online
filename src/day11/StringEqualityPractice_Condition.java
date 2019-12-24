package day11;

public class StringEqualityPractice_Condition {

    public static void main(String[] args) {



        // Create a program to check whether myStr value is JAva
        // if true ---> correct word!!!
        // if false ---> say Java!!!

        String myStr = "Java";

        if(myStr.equals("Java")){
            System.out.println("Correct Word");
        }else{
            System.out.println("Say Java");
        }


        // Update this program to add more condition
        // using else if in the middle

        /*
        *Check the value of myStr
        * if it is Java ---> correct word
        * if it is Cava ---> Pumpkin!!!
        * else say NOT JAVA NOR PUMPKIN
         */


        if(myStr.equals("Java")){
            System.out.println("Correct Word");
        }else if (myStr.equals("Cava")){
            System.out.println("Say Java");
        }else {
            System.out.println("NOT JAVA NOR PUMPKIN");
        }
    }
}
