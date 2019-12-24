package day15;

public class StringCaseInSensitiveCheck {

    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println("name.contains( \"st\") RESULT IS : " + name.contains("st"));

        // I want to check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for ST

        String uppercaseName = name.toUpperCase(); // "ARYA STARK";
        System.out.println("uppercaseName contains ST or not ? " + uppercaseName.contains("ST") );

        String lowercaseName = name.toLowerCase(); //"arya stark";
        System.out.println("lowercaseName contains st or not ? " + lowercaseName.contains("st") );

        // This is called method chaining , combining multiple method call
        // make my name all lowercase then check whether it contains lowercase st



    }
}
