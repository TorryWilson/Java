/* Create an AirplaneFlight class with a flight number, a departure airport, the time of departure, an arrival airport, and a time of arrival.
The flight number is an int value. The departure and arrival airport fields belong to an Airport enum type, with values corresponding
to some of the official IATA airport codes.

For the times of arrival and departure, use Java's LocalTime class.

Each flight has a number, a departure airport, and an arrival airport.
But some flights might not have departure and arrival times.
Create constructors with and without departure and arrival time parameters.

Create a separate class that makes use of your new AirplaneFlight class.
 */
package Airlines;
import java.time.LocalTime;

public class AirplaneFlight {

    private int flightNumber;

    private Airport departAirport;

    private Airport arrivalAirport;

    private java.time.LocalTime departTime;
    private java.time.LocalTime arrivalTime;


    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {

        if (flightNumber > 0) {
            this.flightNumber = flightNumber;
        }
    }

    public LocalTime getDepartTime() {
        return departTime;
    }

    public void setDepartTime(LocalTime departTime) {
        this.departTime = departTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Airport getDepartAirport() {
        return departAirport;
    }

    public void setDepartAirport(Airport departAirport) {
        this.departAirport = departAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }


    public AirplaneFlight(int flightNumber, Airport departAirport, Airport arrivalAirport){

        this.flightNumber = flightNumber;
        this.departAirport = departAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public AirplaneFlight(int flightNumber, Airport departAirport, Airport arrivalAirport, LocalTime departTime, LocalTime arrivalTime) {

        this.flightNumber = flightNumber;
        this.departAirport = departAirport;
        this.arrivalAirport = arrivalAirport;
        this.departTime = departTime;
        this.arrivalTime = arrivalTime;
    }

    public void Display() {

        System.out.println("Flight " + getFlightNumber() + " leaving " + getDepartAirport() + " at " + getDepartTime() + " for " + getArrivalAirport() + " will arrive at " + getArrivalTime() + " in " + getArrivalAirport());
    }
}
