package day12;

public class LoginTest_V2 {

    public static void main(String[] args) {

        String userName = "abc123";

        // CASE SENSITIVE!!!!
        boolean userNameCorrect = userName.equals("ABC123");

        System.out.println( userNameCorrect);

        boolean nameCheckIgnore = userName.equalsIgnoreCase("ABC123");

        System.out.println( nameCheckIgnore );


        String myName = "Siham Yasin";

        boolean myNameCorrect = myName.equals("SiHam YaSiN");
        System.out.println( myNameCorrect);

        boolean nameCheck = myName.equalsIgnoreCase("SiHam YaSiN");
        System.out.println( nameCheck);

    }
}
