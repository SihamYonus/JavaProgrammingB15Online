package day21;

public class SearchingSomethingInString {

    public static void main(String[] args) {

        String name = "Daria Uzez";
        int charCount = name.length();
        System.out.println("charCount = "+ charCount);
        int lasChartIndex = charCount -1 ;
        System.out.println("lastCharIndex = " + lasChartIndex);

        // find out index of all the letter a in case insensitive manner
        // i will go through each and every letter of the string ---> for loop
        // while i am going through each and every string
            // i will check weather current character i am looking at
            // equals to a or A

        System.out.println("----1 char-----");
        for (int i = 0; i <=lasChartIndex ; i++) {
            String currentChar = (name.substring(i,i+1));

            if (currentChar.equalsIgnoreCase("a")){
                System.out.println("The index of a or A is "+ i);
            }
        }



    }
}
