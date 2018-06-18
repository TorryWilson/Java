package Live;

// this class is a subclass of PlaceToLive
// helps create a house object

public class House extends PlaceToLive {

    private double mortgage;
    private double propertyTax;

    public double getMortgage() {
        return mortgage;
    }

    public void setMortgage(double mortgage) {
        this.mortgage = mortgage;
    }

    public double getPropertyTax() {
        return propertyTax;
    }

    public void setPropertyTax(double propertyTax) {
        this.propertyTax = propertyTax;
    }
}


