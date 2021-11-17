package boardingpass;
import person.*;

import java.sql.Time;
import java.time.*;
import java.util.Date;
import java.time.format.DateTimeFormatter;


public class BoardingPass {
    private String origin;
    private String destination;
    private Time eta;
    private LocalDate departure;
    private long boardingPassNumber;
    private FlightClass flightClass;
    private FlightType flightType;



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
}

