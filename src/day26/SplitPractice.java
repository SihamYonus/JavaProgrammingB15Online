package day26;

public class SplitPractice {

    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray(), another is split (bySomething)

        String survey = "Complete B15 Online 1 Month Survey ";

        char[] surveyChars = survey.toCharArray();

        for (char each : surveyChars){

            System.out.println("each char is : " + each);
        }

        System.out.println("=============================");

        //Lets try while loop
        int x = 0;
        while (x < surveyChars.length){

            System.out.println("each char is :" + surveyChars[x] );
            x++;
        }

        System.out.println("=============================");

        // for loop
        for (int i = 0; i < surveyChars.length; i++) {

            System.out.println("each char is :" + surveyChars[i] );
        }

         System.out.println("=============================");

        // do while
        int y = 0;
        do{
            System.out.println(surveyChars[y]);
            y++;
        }while (y< surveyChars.length);

        System.out.println("=============================");











    }
}
