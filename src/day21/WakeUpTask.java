package day21;

public class WakeUpTask {

    public static void main(String[] args) {

        /* given your name stored ia a variable myName as String for example :
        * My name is YourName here
        * loop through each and every character print rhem out like this
        * M->y-> >n->a->m->e-> and so on
        * put arrow in between the charachter
        *
        * Optionally
             2 , print the sentence by 2 character at a time
 		     just by incrementing by 1
             3 , print the sentence by 3 character at a time
             4 , print the sentence by 4 character at a time
         */

        String myName = "My name is Siham Yasin";

        int charCount = myName.length();
        int lastIndex = charCount -1 ;

        for (int i = 0; i < myName.length() ; i++) {
            System.out.print(myName.substring(i,i+1)+ "->");

        }
       // for (int x = 0; x <=lastCharIndex-1 ; x++) {Another way of doing below
        System.out.println("-----2 char-----------");
            for (int x = 0; x <=charCount-2 ; x++) {
            String twoChar = myName.substring(x,x+2);
            System.out.print(twoChar + "->");
        }

        System.out.println("=================================");


        // for (int x = 0; x <=lastCharIndex-2 ; x++) {Another way of doing below
        System.out.println("-----3 char-----------");
        for (int x = 0; x <=charCount-3 ; x++) {
            String threeChar = myName.substring(x,x+3);
            System.out.print(threeChar + "->");
        }

    }
}
