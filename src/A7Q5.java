
import java.util.Scanner;

/**
 * A7Q5
 *
 * @author micla1676
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask user for total number of marks
        System.out.println("Please enter your total amount of marks:");
        //store the user input in a variable
        int a = input.nextInt();

        //create an array to store a amount numbers
        double[] marks = new double[a];

        //create a for loop that loops twice
        for (int x = 0; x < a; x = x + 1) {
            //ask for the 2 integers
            System.out.println("please enter mark #" + (x + 1) + ":");
            //store user input in the array
            marks[x] = input.nextInt();
        }
        //sort the numbers
        //loop a amount of times
        for (int x = 0; x < a; x = x + 1) {
            //loop a amount of times times
            for (int z = x + 1; z < a; z = z + 1) {
                //test if y is larger then the integer at index z
                if (marks[x] > marks[z]) {
                    //if true, switch the 2 numbers
                    //create a temp storage for index z
                    double temp = marks[z];
                    //set index z equal to index x
                    marks[z] = marks[x];
                    //set index x equal to temp
                    marks[x] = temp;
                }
            }
        }
        //print out the 2 numbers
        System.out.println("The marks in adcending order are:");
        //create a for loop that loops a times
        for (int x = 0; x < a; x = x + 1) {
            //print out the 2 numbers
            System.out.println(marks[x]);
        }
        //create double to store median
        double total = 0;
        //check if int a is divisable by 2
        //create variable to store answer
        int r = a % 2;

        //if a is even
        if (r == 0) {
            //divide a by 2
            a = a / 2;
            //create a second variable to get the index value of a - 1
            int z = a - 1;
            //get the average
            total = marks[a] + marks[z];
            //divide by 2
            total = total / 2;
        } //if a is odd
        else if (r > 0) {
            //divide a by 2
            //create integer to store a/2
            int z = a / 2;
            //set total equal to index of z
            total = marks[z];
        }
        //print out the median
        System.out.println("The median is " + total);
    }
}