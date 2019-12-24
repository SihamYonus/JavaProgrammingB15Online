package day25;

import java.util.Arrays;

public class FindLongestWordInASententence {

    public static void main(String[] args) {

    String sentence = "We are trying to find longest word ";

    String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));

        String longestWord = "";
        int maxCharCount = 0;

        //first create a String variable longestword to store my result
        //also create maxCharCount variable to store my longest char count
        //I want to go through each and every word in a string array


        for (String currentWord : allWords){
            if(currentWord.length()> longestWord.length()){
                longestWord = currentWord;
            }
        }
        System.out.println("longestWord = " + longestWord);













    }
}
