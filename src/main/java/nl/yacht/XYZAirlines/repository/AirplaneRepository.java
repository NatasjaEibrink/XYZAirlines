package nl.yacht.XYZAirlines.repository;

import nl.yacht.XYZAirlines.model.Airplane;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AirplaneRepository {

    private static long counter = 0;

    private Map<Long, Airplane> airplane = new HashMap<>();

    public Iterable<Airplane> findAll(){
        Iterable<Airplane> result = this.airplane.values();
        return result;
    }

    public Airplane save(Airplane airplaneToBeSaved){

        counter++; //eerst verhogen en dan opslaan in Airplane map
        this.airplane.put(counter, airplaneToBeSaved);

        airplaneToBeSaved.setId(counter);

        Airplane savedAirplane = this.airplane.get(counter);

        return airplaneToBeSaved;
    }

    public Airplane update(long id, Airplane input){

        Airplane output = this.airplane.get(id);

        output.setFlightNumber(input.getFlightNumber());
        output.setCurrentDestination(input.getCurrentDestination());
        output.setFuelLevel(input.getFuelLevel());

        return output;
    }


}
