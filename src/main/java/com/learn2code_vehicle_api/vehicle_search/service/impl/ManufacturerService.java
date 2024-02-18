package com.learn2code_vehicle_api.vehicle_search.service.impl;

import com.learn2code_vehicle_api.vehicle_search.entity.Manufacturer;
import com.learn2code_vehicle_api.vehicle_search.exception.ManufacturerNotFoundException;

import java.util.List;


public interface ManufacturerService {

    Manufacturer saveManufacturer(Manufacturer manufacturer);
    List<Manufacturer> fetchAllManufacturers();
    Manufacturer getManufactureForId(int id);
    Manufacturer updateManufacturer(int id,  Manufacturer updatedManufacturer);
    void deleteManufacturerById(int id) throws ManufacturerNotFoundException;


}
