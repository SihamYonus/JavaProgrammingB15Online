package day11;

import java.util.Scanner;

public class ReplPractice {

    public static void main(String[] args) {

//
//        Scanner scan = new Scanner(System.in);
//        String word = scan.next();
//
//        if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {
//            word = word.substring(1, word.length());
//            if (word.charAt(word.length() - 1) == 'x' || word.charAt(word.length() - 1) == 'X') ;
//            word = word.substring(0, word.length() - 1);
//            System.out.println(word);
//        }



        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.charAt(0) == 'x' || word.charAt(0) == 'X'|| word.charAt(word.length() - 1) == 'x' || word.charAt(word.length()- 1)== 'X'){
            word = word.substring(1,word.length()-1);
            System.out.println(word);
        }else if(word.charAt(0) == 'x' || word.charAt(0) == 'X'){
            System.out.println(word.substring(1,word.length()));
        }else{
            System.out.println(word);
        }

    }
}
