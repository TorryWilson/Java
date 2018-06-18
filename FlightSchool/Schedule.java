package Airlines;


import java.time.LocalTime;

public class Schedule {

    public static void main (String [] args) {

        AirplaneFlight flight = new AirplaneFlight(3, Airport.LAX, Airport.MSY );

        flight.setDepartTime(LocalTime.of(10, 5));
        flight.setArrivalTime(LocalTime.of(12,5));

        AirplaneFlight flight2 = new AirplaneFlight(4, Airport.TUC, Airport.ATL, LocalTime.of(9, 30), LocalTime.of(13, 30));

        flight.Display();
        flight2.Display();

    }
}
