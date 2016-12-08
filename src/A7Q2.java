
import java.util.Scanner;

/**
 * A7Q2 find out which people are above average height
 *
 * @author micla1676
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create Scanner to read in heights of people
        Scanner input = new Scanner(System.in);

        //ask for amount of people in the group
        System.out.println("How many people are in your group?");

        //store user input
        int group = input.nextInt();

        //create an array to store heights
        double[] heights = new double[group];

        //create a for loop that loops once for each person in the group 
        for (int x = 0; x < heights.length; x = x + 1) {
            //ask for heights of people in group, and store them
            System.out.println("What is the height of person " + (x + 1) + ":");
            //store user input in the array
            heights[x] = input.nextDouble();
        }
        //find average height of group
        //create a total that starts at 0
        double total = 0;
        //add up all heights
        for (int y = 0; y < heights.length; y = y + 1) {
            //add marks
            total = total + heights[y];
        }
        //divide total by length of array to get average
        double avHeight = total / heights.length;

        //find heights that are above the average
        //create a for loop that loops once for each person in the group 
        for (int z = 0; z < heights.length; z = z + 1) {
            //create a variable that temporarily stores a number from the array
            double temp = heights[z];
            //test if temp is greater then the average height
            if (temp > avHeight) {
                //if temp is greater, print that that person is taller then
                //the average height
                System.out.println("Person #" + (z + 1) + " is above the average"
                        + " height");
            }
        }
    }
}