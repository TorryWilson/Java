package Live;



import java.util.Scanner;



public class DisplayThePlaces {





    public static void main(String[] args) {

// creates a scanner object to write to screen

        Scanner keyboard = new Scanner(System.in);

        double costOfliving;

// for loop to create three PlacesToLive objects

        for ( int i = 1; i <= 3; i++) {

            PlaceToLive newPlace = new PlaceToLive();

            System.out.println("Enter address");

            newPlace.setAddress(keyboard.nextLine());

            System.out.println("Enter number of bedrooms");

            newPlace.setBedrooms(keyboard.nextInt());

            System.out.println("Enter area");

            newPlace.setArea(keyboard.nextInt());

            System.out.println("Enter cost of living");

            costOfliving = keyboard.nextDouble();

// calls to methods to return calculated amound

             System.out.println(newPlace.areaCalc(costOfliving));

             System.out.println(newPlace.perBed(costOfliving));

             System.out.println();



        }



        keyboard.close();

    }

}

