package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

//        Store this sentence in a variable msg
//        I struggle with Java I Like Java I love Java Everything is Awesome!
//                loop through each and every letter
//        1, print every other letter
//        meaning : skip a letter each time you go through the letter
//        0123456789
//        I struggle with  -->> Isrgl ih
//        USE CONTINUE FOR THIS TASK
//        2,  when you reach letter a break the loop
//                OTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitve

        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome!";
        int charCount = msg.length();
        System.out.println("Character count = " + charCount);


        // for(int idx = 0; idx <= charCount-1; idx++
        for (int idx = 0; idx < charCount; idx++) {
            if(idx % 2 == 1){
                continue;
            }
            System.out.println(idx + " : " + msg.substring(idx , idx+1));
        }

        System.out.println("===================================");

        // Task 2
        for(int idx = 0; idx <= charCount-1; idx++){

            String currentChar = msg.substring(idx, idx+1);

            if (currentChar.equalsIgnoreCase("a")){
                break;
            }
            System.out.println("currentChar = " + currentChar);
        }

        System.out.println("===================================");


        for(int idx = 0; idx <= charCount-1; idx++){
            //this is the code to skip odd number index letters
            if(idx % 2 == 1){
                continue;// this line will skip the rest and move to next iteration
            }
            // this is storing each character as string
            String currentChar = msg.substring(idx, idx+1);
            // this is checking the currentChar
            if (currentChar.equalsIgnoreCase("j")){
                break;
            }
            System.out.println(idx + " index " + " : currentChar = " + currentChar);
        }

    }
}
