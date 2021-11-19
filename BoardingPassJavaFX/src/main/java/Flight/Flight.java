package Flight;


import java.sql.Time;
import java.util.ArrayList;

public class Flight {
    private int flightLength;
    private FlightClass flightClass;
    private FlightType flightType;
    private Time departure;
    private Time arrival;
    private String carrier;
    ArrayList<Flight> flights;


//@TODO Look at Date Time Formatter for comparing Time PERIODS (ARRIVAL/DEPARTURE (flightLength))
//@TODO pull in parsed data to Arraylist (Lat,Long(flightDistance))


//    public long calculateDistance(){
//  //@TODO add stream to read through file parsing for Longitude and Latitude
//
//    }

    public int getFlightLength() {
        return flightLength;
    }

    public void setFlightLength(int flightLength) {
        this.flightLength = flightLength;
    }

    public FlightClass getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(FlightClass flightClass) {
        this.flightClass = flightClass;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public Time getDeparture() {
        return departure;
    }

    public void setDeparture(Time departure) {
        this.departure = departure;
    }

    public Time getArrival() {
        return arrival;
    }

    public void setArrival(Time arrival) {
        this.arrival = arrival;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

}
