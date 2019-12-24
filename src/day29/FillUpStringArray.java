package day29;

import java.util.Arrays;

public class FillUpStringArray {

    public static void main(String[] args) {

        // Create an array with size 300 and fill it up with I Love Java

        String[] sentence = new String[300];

        //Without a loop this is how we would do it
//        sentence[0] = "I Love Java";
//        sentence[1] = "I Love Java";
//        sentence[2] = "I Love Java";
//        sentence[3] = "I Love Java";
//        sentence[4] = "I Love Java";

        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = (i+1) + ".I Love Java";
        }
        System.out.println("Sentence = " + Arrays.toString(sentence));
    }
}
