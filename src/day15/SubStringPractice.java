package day15;

public class SubStringPractice {

    public static void main(String[] args) {

        // getting the part of the String out of another String

        String movie = "Lord Of The Ring" ;
        // Sub string will return part of another string
        // starting from beginning index until right before ending index

        String wordOf = movie.substring(5,7);
        System.out.println("Word of = " + wordOf);
        // I want to get the word <of> from this movie
        
        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        // Get the second word!
        //               0123456789012345
        // String movie "Lord Of The Ring"

        // find out first space index, second word start right after first place so thats
        // our starting point. My ending point is one more than last index

        int startingPoint = movie.indexOf(" ") + 1 ;
        int endingPoint = movie.length() - 1 ;

        System.out.println("Second word till last : "
                + movie.substring(startingPoint,endingPoint));


        // Assume we already know the location of starting point of second word
        // and the ending of the sentence
        String secondWordTillLast = movie.substring(5,16);
        System.out.println("Second word till last = " + secondWordTillLast) ;

        // If you want to start from somewhere and just get the rest of the String
        // above method will work, however there is even better method
        // if you provide only one parameter to sustring method
        // it will just start from the location and get till the end

        System.out.println("Second Word Till Last : " + movie.substring(startingPoint,endingPoint));


        //Task
        // You know the index already
        // String movie "Lord Of The Ring"
        // TURN Lord Of The Ring ----> Ring Of The Lord


        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);

        System.out.println(wordRing + wordOfThe + wordLord);

        // TURN ---> Lord Of the Word ---> Ring Of The Java Lord

        System.out.println(wordRing + wordOfThe + "Java " + wordLord);









    }
}
