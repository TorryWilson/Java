import java.util.Scanner;

public class DisplayThePlaces {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double costOfliving;

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

             System.out.println(newPlace.areaCalc(costOfliving));
             System.out.println(newPlace.perBed(costOfliving));
             System.out.println();



        }

        keyboard.close();
    }
}
