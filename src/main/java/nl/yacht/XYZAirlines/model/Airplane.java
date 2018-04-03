package nl.yacht.XYZAirlines.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Airplane implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String flightNumber;

    private String currentDestination;

    private String destination;

    private int fuelLevel;


    // No arg constructor
    public Airplane(){ }

    //Constructor

    public Airplane(long id, String flightNumber, String currentDestination, String destination, int fuelLevel) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.currentDestination = currentDestination;
        this.destination = destination;
        this.fuelLevel = fuelLevel;
    }


    // Region of getters and setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getCurrentDestination() {
        return currentDestination;
    }

    public void setCurrentDestination(String currentDestination) {
        this.currentDestination = currentDestination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
