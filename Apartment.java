package Live;


// this class is a subclass of PlaceToLive class
// helps create an Apartment object

public class Apartment extends PlaceToLive {

    private double rental;

    public double getRental() {
        return rental;
    }

    public void setRental(double rental) {
        this.rental = rental;
    }
}
