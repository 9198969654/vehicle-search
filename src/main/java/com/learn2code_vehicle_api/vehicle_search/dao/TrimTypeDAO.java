package com.learn2code_vehicle_api.vehicle_search.dao;

import com.learn2code_vehicle_api.vehicle_search.entity.TrimType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrimTypeDAO extends JpaRepository<TrimType, Integer> {
}
