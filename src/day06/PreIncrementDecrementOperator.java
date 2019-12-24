package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        // initializing(giving value) offer count value to 2
        int offerCount = 2;
        // increasing the number by one using normal way;
        offerCount = offerCount + 1;

        // this is increasing the value by one using compound/shorthand operator
        offerCount += 1;

        // Since increasing and decresing a value is very special and often used in programming
        // there is even shorter shortcut for this operation
        // and we use ++ or --, THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        // We can not use it for any other time like increasing or decreasing value by more than one.
        ++ offerCount; //this is same as offercount +=1; and this offerCount = offercount + 1;
        // its just shorter
        System.out.println("Offer now after increasing by one " + offerCount);

        --offerCount;
        System.out.println("Offer now after decreasing by one " + offerCount);
    }
}
