import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAverage {

    public static void main(String[] args) {

        final int NUM_ELEMENTS = 8;
        Scanner scnr = new Scanner(System.in);
        ArrayList<Double> userNums = new ArrayList<Double>();
        Double sumVal;
        Double averageVal;

        // Get user numbers adn add to userNums
        System.out.println("Enter " + NUM_ELEMENTS + " elements in the array: ");
        for(int i=0; i<NUM_ELEMENTS; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            userNums.add(scnr.nextDouble());
        }

        // Determine average value
        sumVal = userNums.get(0);
        for(int i=0; i<userNums.size(); i++) {
            sumVal += userNums.get(i); // Calculate sum of all numbers
        }
        averageVal = sumVal / userNums.size();

        System.out.println("The average is " + averageVal);
    }
}
