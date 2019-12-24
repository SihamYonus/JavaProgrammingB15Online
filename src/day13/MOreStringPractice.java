package day13;

public class MOreStringPractice {

    public static void main(String[] args) {

        String name = "Ankar" ;
        System.out.println( name);
        name = "Bulent";
        System.out.println( name);

        String name1 = "Pumkin" ;
        System.out.println( name1);

        // String is immutable once created it can not be changed
        // any String actions/ methods that looks like changing the value
        // actually create

        name1.toUpperCase();
        System.out.println(name1);

        System.out.println(name1.toUpperCase());

        // What if I really want to change the name

        name1 = name1.toUpperCase();
        System.out.println( name1);

    }
}
