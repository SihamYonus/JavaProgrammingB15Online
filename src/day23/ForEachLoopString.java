package day23;

public class ForEachLoopString {

    public static void main(String[] args) {


        //create a long array or 5 item called salaries
        //put your salary amounts that you prefer
        //ose for each loop to iterate over them
        //print only the salary more than 10000


        long[] salaries = new long[]{100000L,200000L,150000L,115000L,60000L} ;

        for (long eachSalary : salaries){
            System.out.println("Each Salary = " + salaries);
        }

        for (long salary : salaries){
            
            if (salary > 100000){
                System.out.println("salary = " + salary);
            }
            // how can i skip salaries less than or equal to 100000
            if(salary<= 100000){
                continue;
            }
            System.out.println("salary = " + salary);
        }

    }
}
