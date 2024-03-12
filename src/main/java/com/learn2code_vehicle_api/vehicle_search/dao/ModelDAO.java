package com.learn2code_vehicle_api.vehicle_search.dao;

import com.learn2code_vehicle_api.vehicle_search.entity.Manufacturer;
import com.learn2code_vehicle_api.vehicle_search.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModelDAO extends JpaRepository<Model, Integer> {

    List<Model> findByManufacturer(Manufacturer manufacturer);
    Model findByModelName(String name);

//    @Query("SELECT * FROM models WHERE manufacturer_id = ?1", nativeQuery = true ")
//    List<Model> fetchModelsBasedManufacturerId(int manufacturerId);

//    @Query[SELECT * FROM models WHERE manufacturer_id = ?1", nativeQuery = true ]
//    List<Model> fetchModelsBasedManufacturerID(int manufacturerId);


   // List<Model> findByManufacturerId(int manufacturerId);
    @Query(value = "SELECT * FROM models WHERE manufacturer_id = ?1", nativeQuery = true)
    List<Model> fetchModelsBasedManufacturerID(int manufacturerId);
}
