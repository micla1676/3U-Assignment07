
import java.util.Scanner;

/**
 * A7Q3 populate an array and sort from least to greatest
 *
 * @author micla1676
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //create an array to store 2 numbers
        int[] ints = new int[2];

        //create a for loop that loops twice
        for (int x = 0; x < 2; x = x + 1) {
            //ask for the 2 integers
            System.out.println("please enter your integer:");
            //store user input in the array
            ints[x] = input.nextInt();
        }
        //test if the 1st number is larger then the 2nd number
        if (ints[0] > ints[1]) {
            //if true, switch the 2 numbers
            //create a temp storage for index 0
            int temp = ints[0];
            //set index 0 equal to index 1
            ints[0] = ints[1];
            //set index 1 equal to index 0
            ints[1] = temp;
        }
        //print out the 2 numbers
        System.out.print("The integers in adcending order are: ");
        //create a for loop that loops twice
        for (int x = 0; x < 2; x = x + 1) {
            //print out the 2 numbers
            System.out.println(ints[x]);
        }
    }
}
