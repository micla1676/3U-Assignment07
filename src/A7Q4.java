
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
        int[] tenInt = new int[10];
        //create a for loop that loops twice
        for (int x = 0; x < 10; x = x + 1) {
            //ask for the 2 integers
            System.out.println("please enter your integer:");
            //store user input in the array
            tenInt[x] = input.nextInt();
        }
        //sort the 10 numbers
        //loop 10 times
        for (int x = 0; x < 10; x = x + 1) {
            //loop 10 times
            for (int z = x + 1; z < 10; z = z + 1) {
                //test if y is larger then the integer at index z
                if (tenInt[x] > tenInt[z]) {
                    //if true, switch the 2 numbers
                    //create a temp storage for index z
                    int temp = tenInt[z];
                    //set index z equal to index x
                    tenInt[z] = tenInt[x];
                    //set index x equal to temp.
                    tenInt[x] = temp;
                }
            }
        }
        //print out the 2 numbers
        System.out.println("The integers in adcending order are: ");
        //create a for loop that loops twice
        for (int x = 0; x < 10; x = x + 1) {
            //print out the 2 numbers
            System.out.println(tenInt[x]);
        }
    }
}