package com.learn2code_vehicle_api.vehicle_search.service.impl;

import com.learn2code_vehicle_api.vehicle_search.dao.ManufacturerDAO;
import com.learn2code_vehicle_api.vehicle_search.entity.Manufacturer;
import com.learn2code_vehicle_api.vehicle_search.exception.ManufacturerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ManufacturerServiceImpl implements ManufacturerService{

    @Autowired
    private ManufacturerDAO manufacturerDAO;


    @Override
    public Manufacturer saveManufacturer(Manufacturer manufacturer) {
        return manufacturerDAO.save(manufacturer);
    }

    @Override
    public List<Manufacturer> fetchAllManufacturers() {
        List<Manufacturer> dbManufacturers = manufacturerDAO.findAll();
        return dbManufacturers;
    }

    @Override
    public Manufacturer getManufactureForId(int id) {
        Optional<Manufacturer> dbManufacturer = manufacturerDAO.findById(id);
               if (dbManufacturer.isPresent()){
                   return dbManufacturer.get();
               }
        return null;
    }

    @Override
    public void deleteManufacturerById(int id) throws ManufacturerNotFoundException {
     Manufacturer manufacturer =  getManufactureForId(id);
     if (manufacturer == null){
         throw new ManufacturerNotFoundException("Manufacturer NOT found by id-" +id);
     }
     manufacturerDAO.deleteById(id);
    }
}
