// Use your new PlaceToLive class and my DummiesFrame class to create a GUI application. The GUI application takes information about a place to live and displays the place's cost per square foot and the cost per bedroom.

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
            return "The cost per square foot of the place is " + place.areaCalc(livingCost) + "and the cost per bedroom if " + place.perBed(livingCost);
        }

    }


