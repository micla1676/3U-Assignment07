
import java.util.Scanner;

/**
 * A7Q7 find all primes from 1-1000
 *
 * @author micla1676
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //create repeating loop
        while (true) {

            //create an array to store 999 numbers (2-1000)
            int[] sieve = new int[999];

            //ask user for total number of marks
            System.out.println("Please enter start to begin:");
            //store the user input in a variable
            String starter = input.nextLine();

            //change starter to lowercase
            starter = starter.toLowerCase();

            //if the word is start, start program
            if (starter.equals("start")) {
            } 
            //if word is not start, end program
            else {
                break;
            }

            //create a for loop that fills the array
            for (int x = 0; x < 999; x = x + 1) {
                sieve[x] = x + 2;
            }

            //loop while y is < 998
            for (int y = 0; y < 998; y = y + 1) {
                //create an integer to store prime numbers
                //store the first prime number into p
                int p = sieve[y];
                //skip if p is equal to zero
                if (p == 0) {
                } 
                //create loop to skip jumber that are not primes
                //if p is greater then 0
                else if (p > 0) {
                    //create a seive to go through each number
                    for (int x = 1; x < 998; x = x + 1) {
                        //create an integer to store remainder
                        int r = sieve[x] % p;

                        //if there is a remainder, skip
                        if (r > 0) {
                        } //if there is no remainder, replace integer with 0
                        else if (r == 0) {
                            //replace integer with 0
                            sieve[x] = 0;
                        }
                    }
                }
                //print p if p is greater then 0
                if (p > 0) {
                    System.out.println(p);
                }
            }
        }
    }
}
