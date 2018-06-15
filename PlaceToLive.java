public class PlaceToLive {

    private String address;
    private int bedrooms;
    private int area;


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

    public double areaCalc(double costofLiving) {

    double perFoot = area / costofLiving;

    return perFoot;
}

    public double perBed(double costofLiving) {

        double bedCost = costofLiving / bedrooms;

        return bedCost;
    }


}

