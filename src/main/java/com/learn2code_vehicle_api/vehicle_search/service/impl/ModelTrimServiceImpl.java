package com.learn2code_vehicle_api.vehicle_search.service.impl;

import com.learn2code_vehicle_api.vehicle_search.dao.ModelDAO;
import com.learn2code_vehicle_api.vehicle_search.dao.TrimTypeDAO;
import com.learn2code_vehicle_api.vehicle_search.entity.Model;
import com.learn2code_vehicle_api.vehicle_search.entity.TrimType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelTrimServiceImpl implements ModelTrimService{

    @Autowired
    private ModelDAO modelDAO;

    @Autowired
    private TrimTypeDAO trimTypeDAO;

    @Override
    public Model saveModel(Model model) {
       Model savedModel =  modelDAO.save(model);
        return savedModel;
    }

    @Override
    public TrimType saveTrimType(TrimType trimType) {
        return trimTypeDAO.save(trimType);

    }

    @Override
    public List<Model> getAllModels() {
        List<Model> savedModels =  modelDAO.findAll();
        return savedModels;

    }
}















