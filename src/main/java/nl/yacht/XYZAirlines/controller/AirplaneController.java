package nl.yacht.XYZAirlines.controller;

import nl.yacht.XYZAirlines.model.Airplane;
import nl.yacht.XYZAirlines.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/airplanes")
public class AirplaneController {

    @Autowired
    private AirplaneRepository airplaneRepository;

    @GetMapping
    public Iterable<Airplane> findAll(){

        Iterable<Airplane> airplanes = this.airplaneRepository.findAll();
        return airplanes;
    }

    @PutMapping(value = "{id}")
    public Airplane update (@PathVariable long id, @RequestBody Airplane input){

        return this.airplaneRepository.update(id, input);
    }

    @PostMapping(value="{id}")
    public Airplane save (@RequestBody Airplane airplane){

        return this.airplaneRepository.save(airplane);
    }
}
