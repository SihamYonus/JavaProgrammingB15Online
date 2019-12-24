package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        String msg= "I like Dog, Dogs are cute, Dogs are friendly " ;
        int lastCharacterIndex = msg.length()-1;

        for (int i = 0; i <= lastCharacterIndex-2 ; i++) {
            String current3chars = msg.substring(i,i+3);

           // System.out.println(i + " : " + current3chars);

            if (current3chars.equals("Dog")){
                System.out.println("BINGO!!! AT " + i);
            }
        }


    }
}
