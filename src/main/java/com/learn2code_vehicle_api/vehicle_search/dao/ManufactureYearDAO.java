package com.learn2code_vehicle_api.vehicle_search.dao;

import com.learn2code_vehicle_api.vehicle_search.entity.ManufactureYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureYearDAO extends JpaRepository<ManufactureYear, Integer> {
}
