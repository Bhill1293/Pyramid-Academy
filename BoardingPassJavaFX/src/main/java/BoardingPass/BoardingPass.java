package BoardingPass;

import Flight.Flight;


import java.sql.Time;
import java.time.LocalDate;


public class BoardingPass {
    private String origin;
    private String destination;
    private Time eta;
    private LocalDate departure;
    private long boardingPassNumber;
    private String airportCode;
    private Flight flight;


//@TODO parse data to get airportCode

    public BoardingPass(String destination, String origin) {
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Time getEta() {
        return eta;
    }

    public void setEta(Time eta) {
        this.eta = eta;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    public long getBoardingPassNumber() {
        return boardingPassNumber;
    }

    public void setBoardingPassNumber(long boardingPassNumber) {
        this.boardingPassNumber = boardingPassNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}

