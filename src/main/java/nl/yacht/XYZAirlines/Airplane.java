package nl.yacht.XYZAirlines;

public class Airplane {

    private long id;

    private String flightNumber;

    private String origin;

    private String destination;

    private int fuelLevel;



    // No arg constructor
    public Airplane(){ }
    
    //Constructor
    public Airplane(long id, String flightNumber, String origin, String destination, int fuelLevel) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.origin = origin;
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

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }


}
