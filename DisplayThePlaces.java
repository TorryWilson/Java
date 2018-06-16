package Live;
import java.util.Scanner;
public class DisplayThePlaces {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // for loop that creates 3 houses
        for ( int i = 1; i <= 3; i++) {

            House newHome = new House();
            
            System.out.println("Enter mortgage");
            newHome.setMortgage(keyboard.nextDouble());
            
            System.out.println("Enter number of bedrooms");
            newHome.setBedrooms(keyboard.nextInt());
            
            System.out.println("Enter area");
            newHome.setArea(keyboard.nextInt());
            
            // Should make a display method
            System.out.print("This home is ");
            System.out.printf("$%4.2f\n", newHome.areaCalc(newHome.getArea()));
            System.out.println( " per square foot calculated monthly");
            System.out.print("This home is ");
            System.out.printf("$%4.2f\n", newHome.perBed(newHome.getMortgage()));
            System.out.println( " per bedroom monthly");
             System.out.println();
        }
        
        
        // for loop that creates 3 apartments
        for ( int j = 1; j <= 3; j++) {

            Apartment newApartment = new Apartment();
            System.out.println("Enter rent");
            
            newApartment.setRental(keyboard.nextDouble());
            System.out.println("Enter number of bedrooms");
            
            newApartment.setBedrooms(keyboard.nextInt());
            System.out.println("Enter area");
            
            newApartment.setArea(keyboard.nextInt());
            System.out.print("This apartment is ");
            
            System.out.printf("$%4.2f\n", newApartment.areaCalc(newApartment.getArea()));
            System.out.println( " per square foot calculated monthly");
            System.out.print("This apartment is ");
            System.out.printf("$%4.2f\n", newApartment.perBed(newApartment.getRental()));
            System.out.println( " per bedroom monthly");
            System.out.println();
        }

        keyboard.close();
    }
}
