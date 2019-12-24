package day27;

public class ArraysTask {

    public static void main(String[] args) {

          /*Task:02
               write a program that can find the minimum number from an array
               DO NOT use sort method

               write a program

         */

        int[] scores ={100,897,654,32,1231,224,556,7,1,2,3,4};
        int min = 99999999;
        for (int i = 0; i < scores.length; i++){
            if (min > scores[i]){
                min = scores[i];
            }
        }
        System.out.println("minimun number: "+min);


        // find second minimun number
        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]==min){
                continue;
            }
            if(secondMin > scores[i]){
                secondMin = scores[i];
            }
        }
        System.out.println("second minimun number is: "+secondMin);


        // find third minimun number
        int thirdMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]== min || scores[i] == secondMin){
                continue;
            }
            if (thirdMin>scores[i]){
                thirdMin = scores[i];
            }
        }
        System.out.println("third minimun number is: "+thirdMin);



    }
}
