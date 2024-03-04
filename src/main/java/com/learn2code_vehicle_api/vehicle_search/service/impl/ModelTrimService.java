package com.learn2code_vehicle_api.vehicle_search.service.impl;

import com.learn2code_vehicle_api.vehicle_search.entity.Model;
import com.learn2code_vehicle_api.vehicle_search.entity.TrimType;

public interface ModelTrimService {

    Model saveModel(Model model);
    TrimType saveTrimType(TrimType trimType);
}
