package day22;

public class StringArray {

    public static void main(String[] args) {

        String[] size = new String[4];

        size[0] = "Medhanit";
        size[1] = "Surian";
        size[2] = "Sabrina";
        size[3] = "Monsur";

        System.out.println(size[0]);
        System.out.println(size[1]);
        System.out.println(size[2]);
        System.out.println(size[3]);

        // immutable means you can not change the internal structure of the object
        // if you have String abc = "Hello"
        // if you do abc.toUpperCase ---> it will create new String object "HELLO"
        // and it does not change original hello at all!!

        // not resizable ----> specifically for array
        // we can not change the size of array once we create them with certain size
        //// However , we can change the elements inside this array
        //// and it means : IT IS NOT IMMUTABLE
    }
}
