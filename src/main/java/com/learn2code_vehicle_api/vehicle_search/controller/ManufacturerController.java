package com.learn2code_vehicle_api.vehicle_search.controller;


import com.learn2code_vehicle_api.vehicle_search.entity.Manufacturer;
import com.learn2code_vehicle_api.vehicle_search.exception.ManufacturerNotFoundException;
import com.learn2code_vehicle_api.vehicle_search.service.impl.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manufacturers")
public class ManufacturerController {

    @Autowired
    public ManufacturerService manufacturerService;

    @PostMapping
    public ResponseEntity<Manufacturer> createManufacturerInDB(@RequestBody Manufacturer manufacturer){
       Manufacturer dbRecord =  manufacturerService.saveManufacturer(manufacturer);
       return new ResponseEntity<>(dbRecord, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Manufacturer>> getAllManufacturers(){
        List<Manufacturer> savedManufacturers =  manufacturerService.fetchAllManufacturers();

        return ResponseEntity.status(HttpStatus.OK).body(savedManufacturers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manufacturer> getManufacturerBasedOnId(@PathVariable int id) throws ManufacturerNotFoundException {
        Manufacturer dbManufacturer = manufacturerService.getManufactureForId(id);
        if (dbManufacturer == null){
            throw new ManufacturerNotFoundException("No Manufacturer found for ID- : " +id);
        }
        return ResponseEntity.ok(dbManufacturer);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteManufacturerById(@PathVariable int id) throws ManufacturerNotFoundException {
        manufacturerService.deleteManufacturerById(id);
        return new ResponseEntity<>("Manufacturer DELETED from DB with ID- "+id, HttpStatus.OK);

    }
}
