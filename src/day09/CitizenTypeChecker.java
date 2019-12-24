package day09;

public class CitizenTypeChecker {

    public static void main(String[] args) {

//         /**/ Task 2
//        Create a class called CitizenTypeChecker with main method
//                Create a variable called cityzenType as String
//                And create a variable with age wiyh value
//                If the age  is more than 65 , assign value of cityzenType to Senior
//        If not , assign value of  cityzenType to Not-Senior



        String citizenType ;

        int age = 80 ;

        if ( age>65){
            citizenType = "Senior";
        }else {
            citizenType = "Not Senior";
        }

        System.out.println("The citizen age is " + age +" and he is "+ citizenType);
    }

}
