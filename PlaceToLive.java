// A PlaceToLive has an address, a number of bedrooms, and an area (in square feet or square meters). Write the PlaceToLive class's code.
// Write code for a separate class named DisplayThePlaces. Your DisplayThePlaces class creates a few PlaceToLive instances by assigning values to their address, numberOfBedrooms, and area fields.
// The DisplayThePlaces class also reads (from the keyboard) the cost of living in each place. For each place, your code displays the cost per square foot (or square meter) and the cost per bedroom
package Live;
public class PlaceToLive {
// fields that a place to live has
    private String address;
    private int bedrooms;
    private int area;

    
 // getters and setters for fields
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    // method that calculates cost per square foot and returns it
    public double areaCalc(double costofLiving) {

    double perFoot = area / costofLiving;

    return perFoot;
}

    // method that calculates cost per bed and returns it.
    public double perBed(double costofLiving) {

        double bedCost = costofLiving / bedrooms;

        return bedCost;
    }


}

