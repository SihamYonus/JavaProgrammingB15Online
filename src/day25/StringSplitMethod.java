package day25;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] allWords = sentence.split(" ");

        System.out.println("allWords = " + Arrays.toString(allWords) );
        System.out.println("How many word do I have in this sentence ? : " + allWords.length);

        // How do I get the last word of the sentence using this array I got from string
        System.out.println("Last word in this sentence is " + allWords[allWords.length-1]);

        // ARE WE LIMITED TO SPLIT BY SPACE OR WE CAN SPLIT  BY ANYTHING ?  ---> ANYTHING

        String sentence2 = "  Everything is Awesome!!!!";
        //split by letter e
        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));

        for (String eachPieces : splitBy_e_Arr){
            System.out.println("eachPieces = <" +eachPieces+">");
        }
        // split this sentence by is and print out your result

        String[]SplitBy_is_Arr = sentence2.split("is");
        System.out.println("SplitBy_is_Arr = " + Arrays.toString(SplitBy_is_Arr) );









    }
}
