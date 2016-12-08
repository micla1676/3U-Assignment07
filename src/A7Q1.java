
import java.util.Scanner;

/**
 * A7Q1 calculate student averages
 *
 * @author micla1676
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //ask how many students are in the class
        System.out.println("How many students in the class?");

        //store the user input
        int z = input.nextInt();

        //create an array to store marks
        double[] marks = new double[z];

        //ask for marks
        System.out.println("Enter marks:");
        //store marks in array using a loop
        for (int x = 0; x < marks.length; x = x + 1) {
            marks[x] = input.nextDouble();
        }
        //add all number using a loop
        //start a total at 0 
        double total = 0;

        //add up all marks marks
        for (int x = 0; x < marks.length; x = x + 1) {
            //add marks
            total = total + marks[x];
        }

        //divide total by total # of numbers in the array to get average
        total = total / marks.length;

        //print out class average
        System.out.println("The class average is " + (total) + "%");
    }
}
