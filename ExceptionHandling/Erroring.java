import java.util.InputMismatchException;
import java.util.Scanner;

public class Erroring {

    public static void main (String [] args)  {

        final double boxprice = 3.50;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("# of boxes");
        int number = 0;
        boolean goodInput = false;
        do
        try {
             number = keyboard.nextInt();
            if (number < 0 || number > 100000) {
                throw new Exception();
            }
            goodInput = true;
            System.out.println(number * boxprice);
        }
            catch (InputMismatchException i) {
            System.out.println("That's not a valid number");
        }
            catch (Exception e) {
            System.out.println("Number has to be greater than 0 and less than 100000");
        }
        while(!goodInput);
        keyboard.close();


    }
}
