package com.learn2code_vehicle_api.vehicle_search.dao;

import com.learn2code_vehicle_api.vehicle_search.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerDAO extends JpaRepository<Manufacturer, Integer> {
}
