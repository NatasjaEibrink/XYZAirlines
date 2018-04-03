package nl.yacht.XYZAirlines;

import java.util.List;

public class Airport {

    private List<Airplane> airplanes;

    //no arg constructor
    public Airport(){}

    //constructor

    public Airport(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    //region of getters and setters

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
}
