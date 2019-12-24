package day23;

public class ForEachLoopPracticeFindMax {

    public static void main(String[] args) {

        long[] salaries = new long[]{100000L,200000L,150000L,115000L,60000L} ;
        long maxSalary = salaries[0];

        for (long salary : salaries) {
            if (salary > maxSalary){
                maxSalary = salary;
            }
            
        }
        System.out.println("maxSalary = " + maxSalary);
    }
}
