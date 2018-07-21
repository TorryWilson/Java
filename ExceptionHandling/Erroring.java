// Write a program that computes the cost of boxes of chocolate that are $6.50 each. 


import java.util.InputMismatchException;
import java.util.Scanner;

public class Erroring {

    public static void main (String [] args)  {

        // set price of a box of chocolate
        final double boxprice = 6.50;
        
        Scanner keyboard = new Scanner(System.in);
        
        // asks user how many boxes she/he wants
        System.out.println("How many boxes of chocolate you want?");
        
        // initalizing variables 
        int number = 0;
        boolean goodInput = false;
        
        // do while loop that keeps running if user enters bad data
        do
        try {
             number = keyboard.nextInt();
            // if user enters value thats not between 0 and 100000 throws exception
            if (number < 0 || number > 100000) {
                // throws generic exception that I created
                throw new Exception();
            }
            // if user enters correct value exits loop after its computes price
            goodInput = true;
            System.out.println(number * boxprice);
        } // if user enters wrong type of data such as a string error is handled here
            catch (InputMismatchException i) {
            System.out.println("That's not a valid number");
        }
          // user enters a number thats not between 0 and 100000 error gets handled here.
            catch (Exception e) {
            System.out.println("Number has to be greater than 0 and less than 100000");
        }
        while(!goodInput);
        keyboard.close();


    }
}
