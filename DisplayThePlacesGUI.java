package Live;

public class DisplayThePlacesGUI {

    public static void main(String[] args) {
        DummiesFrame window = new DummiesFrame("Enter a place");


            window.addRow("Enter address");
            window.addRow("Enter number of bedrooms");
            window.addRow("Enter area");
            window.addRow("Enter cost of living");
            window.go();



    }
        public static String calculate(String address,int bedrooms, int area, double livingCost){

            PlaceToLive place = new PlaceToLive();
            place.setAddress(address);
            place.setBedrooms(bedrooms);
            place.setArea(area);

            return
        }

    }



