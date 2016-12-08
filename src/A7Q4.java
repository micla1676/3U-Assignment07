
import java.util.Scanner;

/**
 * A7Q4 sort 10 numbers
 *
 * @author micla1676
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //create an array to store 10 numbers
        int[] marks = new int[10];
        //create a for loop that loops twice
        for (int x = 0; x < 10; x = x + 1) {
            //ask for the 2 integers
            System.out.println("please enter your marks:");
            //store user input in the array
            marks[x] = input.nextInt();
        }
        //sort the numbers
        //loop a amount of times
        for (int x = 0; x < 10; x = x + 1) {
            //loop a times
            for (int z = x + 1; z < 10; z = z + 1) {
                //test if y is larger then the integer at index z
                if (marks[x] > marks[z]) {
                    //if true, switch the 2 numbers
                    //create a temp storage for index z
                    int temp = marks[z];
                    //set index z equal to index x
                    marks[z] = marks[x];
                    //set index x equal to temp.
                    marks[x] = temp;
                }
            }
        }
        //print out the 2 numbers
        System.out.println("The marks in adcending order are: ");
        //create a for loop that loops twice
        for (int x = 0; x < 10; x = x + 1) {
            //print out the 2 numbers
            System.out.println(marks[x]);
        }
    }
}