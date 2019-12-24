package day31;

public class SeasonChecker {

    public static void main(String[] args) {

        /**
         * Write a static method called decideSeasonAction
         * It has one String parameter called season
         * Inside method method :
         * according to what user passed it should print correct action
         */

        // a String variable declared and assigned value inside main method
        // It can be accessible in main method
        String season = "Winter";
        decideSeasonAction(season);


        decideSeasonAction("Winter");
        decideSeasonAction("Summer");


    }

    public static void decideSeasonAction(String season){

        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin picking");
                break;
            case "Winter":
                System.out.println("Go Snowboarding");
                break;
            default:
                System.out.println("INVALID");
        }
    }


}
