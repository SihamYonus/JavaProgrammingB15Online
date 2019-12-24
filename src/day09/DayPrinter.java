package day09;

public class DayPrinter {

    public static void main(String[] args) {

        /* Create a variable called dayCode as int

         * If the daycode is 1 ----> Monday
         * If the daycode is 2 ----> Tuesday
         * If the daycode is 3 ----> Wednsday
         * If the daycode is 4 ----> Thursday
         * If the daycode is 5 ----> Friday
         * If the daycode is 6 ----> Saturday
         * If the daycode is 7 ----> Sunday
         * If none of the above just print unknown say
         *
         **/

        int dayCode = 2 ;

        if (dayCode==1){
            System.out.println("Day is Monday");
        }else if (dayCode==2) {
            System.out.println("Day is Tuesday");
        }else if ((dayCode==3)){
            System.out.println("Day is Wednsday");
        }else if (dayCode==4){
            System.out.println("Day is Thursday");
        }else if ((dayCode==5)){
            System.out.println("Day is Friday");
        }else if ((dayCode==6)){
            System.out.println("Day is Saturday");
        }else if ((dayCode==7)){
            System.out.println("Day is Sunday");
        }else {
            System.out.println("Day is Unknown");
        }
    }
}
