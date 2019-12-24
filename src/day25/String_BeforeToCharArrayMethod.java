package day25;

import java.util.Arrays;

public class String_BeforeToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Alesya";

        // how would you store each and every character
        // to a char array from above name
        // without using method we are about to learn

        char[] nameChar = new char[name.length() ];//new char [ 6 ];

        nameChar[0] = name.charAt(0);
        nameChar[1] = name.charAt(1);

        // using for loop
        for (int i = 0; i < nameChar.length ; i++) {
            // take each character of name and fill the char array values
            nameChar[i] = name.charAt(i);
        }
        System.out.println("nameChar = " + Arrays.toString(nameChar));


        char[] nameChars2 = name.toCharArray();
        System.out.println("namesChar2 = " + Arrays.toString(nameChars2));






    }
}
