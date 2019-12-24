package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each chRcter has its corresponding ascii value
        // from ascii table
        // int x = 'A' ;

        char myChar = 'A';
        // 'A ' + 1 ---> 65 + 1 ---> 66 ---> 'B ' (MyChar data type is char)

        System.out.println(myChar);
        System.out.println( ++myChar );
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        System.out.println('A' > 'B'); // 65>66
        System.out.println('Z' > 'B'); // 65>66

        for (char iChar = 'A' ; iChar <= 'Z' ; iChar ++){
            System.out.print( iChar + " ");
        }

        System.out.println();

        for (char kChar = 'Z' ; kChar >= 'A' ; kChar--){
            System.out.print(kChar + " ");
        }

        // Homework
        // Create an interactive program to ask user
        // Starting character and ending character
        // then print everything in between
        // it would be starting character is after ending character
        // for example user can enter Z A or A K
        // Ask user for String and pick character by charAt()
        // Ask user for String and pick first character by charAt(0)
    }
}
