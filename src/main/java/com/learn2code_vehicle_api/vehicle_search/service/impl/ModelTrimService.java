package com.learn2code_vehicle_api.vehicle_search.service.impl;

import com.learn2code_vehicle_api.vehicle_search.entity.Model;
import com.learn2code_vehicle_api.vehicle_search.entity.TrimType;
import com.learn2code_vehicle_api.vehicle_search.exception.ModelNotFoundException;

import java.util.List;

public interface ModelTrimService {

    Model saveModel(Model model);
    TrimType saveTrimType(TrimType trimType);
    List<Model> getAllModels();
    Model modifyModel(int id,Model model) throws ModelNotFoundException;
    TrimType modifyTrimType(int id, TrimType trimType);
    Model getModelById(int id) throws ModelNotFoundException;
    TrimType getTrimTypeById(int id);
}
