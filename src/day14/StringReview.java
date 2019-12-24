package day14;

public class StringReview {

    public static void main(String[] args) {

        String str ="Pumpkin";

        System.out.println( str.equals("Pumpkin"));

        // contains
        // it checks whether a string exists in another string
        // and return true or false result
        System.out.println("Does it contain Pumpkin : ");
        System.out.println(  str.contains("Pumpkin"));
                                  // true
        boolean gotPumpkin = str.contains("Pumpkin");
        // shortcut to print variable value in nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startswith endsWith
        // check whether a string start with another srting
        // check whether a string ends with another string
        // and return true or false

        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);
        
        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);

        // PASSWORD VALIDATOR

        // MINIMUM 8 CHAR MAX 16 CHAR
        // IT MUST CONTAIN _ OR $
        // IT MUST NOT CONTAIN SPACE
        // IT MUST START Ab

        //if any of  the above condition does not match say INVALID PASSWORD
        // else say GOOD PASSWORD !
        String password = "ASH2723gfgdsu";

        // MINIMUM 8 CHAR MAX 16 CHAR
        // password.lenght() >=8 && password.lenght() <=16
        boolean min8max16 = password.length() >= 8 && password.length()<= 16;

        // IT MUST CONTAIN _ OR $
        // password.contains("_") || password.contains("$")
        boolean mustContains_or$ = password.contains("_") || password.contains("$");

        // IT MUST NOT CONTAIN SPACE
        // ! password.contains(" ")
        boolean mustNotContainsSpace = !password.contains(" ") ;

        // IT MUST START Ab
        // password.startwith("Ab")
        boolean mustStartsWithAb = password.startsWith("Ab");

        if (min8max16 && mustContains_or$ && mustNotContainsSpace && mustStartsWithAb){
            System.out.println("VALID PASSWORD");
        }else {
            System.out.println("INVALID PASSWORD");
        }


        
    }
}
