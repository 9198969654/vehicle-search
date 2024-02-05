package com.learn2code_vehicle_api.vehicle_search.service.impl;

import com.learn2code_vehicle_api.vehicle_search.dao.ManufacturerDAO;
import com.learn2code_vehicle_api.vehicle_search.entity.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ManufacturerServiceImpl implements ManufacturerService{

    @Autowired
    private ManufacturerDAO manufacturerDAO;


    @Override
    public Manufacturer saveManufacturer(Manufacturer manufacturer) {
        return manufacturerDAO.save(manufacturer);
    }
}
