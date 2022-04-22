//Name: Chase Poland
//Class: CSPC 200
//Date: 04/18/22 
//Version: A ? 
//Time: 25 mins
//Status: Ok Project? I actually wish we werent given a template for this but I might be alone in that feeling
import java.util.*;

public class SumPrimes {
    public static int sumArray(int a, int b) {
        // Gave variables to our total sum, and simply to keep track of what number were looking at. 
        int number = 0;
        int sum = 0;

        // Created an ArrayList to add each prime number to said ArrayList. 
        ArrayList <Integer> abc = new ArrayList <Integer> ();

        // Loop that checks all numbers through the two userinputted variables.
        // Calls the isPrime function and if it is true, it will add that specific number to the ArrayList.
        for (int i = a; i < b; i++) {
            number = i;
            if (isPrime(number) == true) 
                abc.add(number);
        }

        // Made a loop between 0 and the size of the array, which will add up the total sum of all prime numbers in that array.
        for (int j = 0; j < abc.size(); j++) {
            sum += abc.get(j); // With ArrayLists, we use .get() as opposed to abc[j]; 
        }
        //System.out.println(abc); // Prints out all the primes within the ArrayList. ; Debugging Method.
        return sum;

    }
    static boolean isPrime(int n) {
        // Case One, cannot be prime if it is 1 or less than one.
        if (n <= 1) return false; // NOT PRIME
        // Case Two, if it is divisible by a given # and has NO remainder, it will be a composite #. 
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false; // NOT PRIME
        }
        // If it doesnt apply to either case, it passes inspection and returns true. 
        return true; // IS PRIME
    }
    public static void main(String[] args) {
        // Initialzation
        Scanner scan = new Scanner(System.in);

        // Declaration of Variables
        int num1, num2;

        // Without Command Line, just replace args[0] & args[1] with sOne & sTwo.
        //String sOne = scan.next(); 
        //String sTwo = scan.next();

        // Conversion from Strings to Ints
        num1 = Integer.parseInt(args[0]); // args[0] for command line input #1 (?, x)
        num2 = Integer.parseInt(args[1]); // args[1] for command line input #2 (x. ?)
        
        // Output of the sum based on user input.
        System.out.println(sumArray(num1, num2));
    }
}