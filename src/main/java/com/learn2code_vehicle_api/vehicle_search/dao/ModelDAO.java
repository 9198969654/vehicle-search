package com.learn2code_vehicle_api.vehicle_search.dao;

import com.learn2code_vehicle_api.vehicle_search.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelDAO extends JpaRepository<Model, Integer> {
}
