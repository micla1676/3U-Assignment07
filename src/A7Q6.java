
import java.util.Scanner;

/**A7Q6
 * find the lowest mark, highest mark, and average mark, in a nice way
 * @author micla1676
 */
public class A7Q6 {

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

        //create a for loop that loops a times
        for (int x = 0; x < a; x = x + 1) {
            //ask for the 2 integers
            System.out.println("please enter mark #" + (x + 1) + ":");
            //store user input in the array
            marks[x] = input.nextInt();
        }
        //sort the numbers
        //loop a times
        for (int x = 0; x < a; x = x + 1) {
            //loop a times
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
        
        //print out the lowest mark
        System.out.println("The lowest mark is: " + marks[0]);
        
        //print out the highest mark
        System.out.println("The highest mark is: " + marks[a-1]);
        
        //create an integer to store the average
            double average = 0;
        
        //print out the average
        for (int x = 0; x < a; x = x + 1) {
            //add the number at index x to the average
            average = average + marks[x];
        }
        //find the average by dividing "average" by a
        average = average / a;
        
        //print out the average
        System.out.println("The average mark is: " + average);
       
        }
        
    }
