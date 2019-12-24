package day20;

public class PalindromeTest {

    public static void main(String[] args) {

        // if you reverse a String and it does not change
        // it means the string is  Palindrone

        String name = "Kayak";
        System.out.println("name = " + name);

        String reversedName = "";

        for (int i = name.length()-1 ; i >0 ; i--) {
            reversedName = reversedName + name.charAt(i);
        }
        System.out.println("reversedName = " + reversedName);

        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("PALINDROME TEST HAS PASSED");
        }else{
            System.out.println("PALINDROME TEST HAS FAILED");
        }


    }

}
