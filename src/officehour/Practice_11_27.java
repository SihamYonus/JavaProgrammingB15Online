package officehour;

public class Practice_11_27 {

    public static void main(String[] args) {


        String message =  "  I LOVE  JAVA    ";
        // trim ----> takes out spaces at the beginning and ending of a string object
        System.out.println("message = <" + message + ">");

        String messageTrimmed = message.trim();
        System.out.println("message = <" + messageTrimmed + ">");
        // it does not take out the space in between characters

        // isEmpty ---> checks whether a string object is empty, meaning there is nothing inside""
        // isEmpty = yourString.length() == 0 ---> true
        String emptySpaces = "   ";
        System.out.println("emptySpaces = <" + emptySpaces + ">");

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length= " + emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is Empty= " + emptySpacesAfterTrimmed.isEmpty());

        // isEmpty VS isBlank method from string class
        // isEmpty ---> if yourString.lenght()>0 true else its false
        // isBlack if you have only white spaces, it gets true else get false

        System.out.println("emptySpaces is blank or not ?? " + emptySpaces.isBlank());
        
        // indexOf ----> it gives you location of the string you are looking for inside anotherString
        // for example yourString.indexOf("abc")
        //                    01234567890123456
        // String message  = "   I LOVE JAVA   ";
         
        int locationOfLove = message.indexOf("LOVE");
        System.out.println("locationOfLove = " + locationOfLove);
        // lastIndexOf ---> gives you the last location of the string you are looking for inside anotherString
        
        int lastIndexOfLetterA = message.lastIndexOf("A");
        System.out.println("lastIndexOfLetterA = " + lastIndexOfLetterA);

        // contains: ---> check whether a String exists inside another String and return true/false
        boolean messageContainsLove = message.contains("LOVE");
        System.out.println("message Contains Love = " + messageContainsLove);








    }
}
