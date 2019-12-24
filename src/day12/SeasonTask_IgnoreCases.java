package day12;

import java.util.Scanner;

public class SeasonTask_IgnoreCases {

    public static void main(String[] args) {

           /*
    * // Task 5 :
        Create a String variable season

        Assign value by asking user question : Enter your season Please !!

        Check the season using if statements without caring about the case
         If Spring —>  Hiking , Navruz , Alergy Season , Cool weather
         If Summer —>> Pool , Swimming , Beach , Vacation
        If Fall —>>>  barbecue , riding bike , JUST CODE !!!! Halloween
        If Winter —>> CODE!!!!!! Ski , sledding , snowman
    * */



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please");
        String season = scan.next();



        if (season.equalsIgnoreCase("Spring")){
            System.out.println("Hiking, Navruz, Allergy Season Cool weather");
        }else if (season.equalsIgnoreCase("SUMMER")){
            System.out.println("Pool, Swimming, Beach, Vacation");
        }else if (season.equalsIgnoreCase("Fall")){
            System.out.println("Barbecue, riding bike, JUST CODE!!!");
        }else if (season.equalsIgnoreCase("WINTER")){
            System.out.println("CODE!!! Ski, sledding,scowman");
        }else {
            System.out.println("Not Valid");
        }
    }
}
