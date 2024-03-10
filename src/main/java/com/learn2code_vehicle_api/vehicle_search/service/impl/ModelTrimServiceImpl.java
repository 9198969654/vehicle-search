package com.learn2code_vehicle_api.vehicle_search.service.impl;

import com.learn2code_vehicle_api.vehicle_search.dao.ModelDAO;
import com.learn2code_vehicle_api.vehicle_search.dao.TrimTypeDAO;
import com.learn2code_vehicle_api.vehicle_search.entity.Model;
import com.learn2code_vehicle_api.vehicle_search.entity.TrimType;
import com.learn2code_vehicle_api.vehicle_search.exception.ModelNotFoundException;
import com.learn2code_vehicle_api.vehicle_search.exception.TrimTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @Override
    public Model modifyModel(int id, Model model) throws ModelNotFoundException {
      Model dbModel =   getModelById(id);
      if (dbModel != null  && Objects.nonNull(model)){
          if (Objects.nonNull(model.getModelName()) && !"".equalsIgnoreCase(model.getModelName())){
              dbModel.setModelName(model.getModelName());
          }
          modelDAO.save(dbModel);
      }
        return null;
    }

    @Override
    public TrimType modifyTrimType(int id,TrimType trimType) throws TrimTypeNotFoundException {
        Optional<TrimType> trimTypeOptional = trimTypeDAO.findById(id);
        if (trimTypeOptional.isPresent()){
            throw new TrimTypeNotFoundException("No Trim Type found in DB with ID: " +id);
        }
        return null;
    }

    @Override
    public Model getModelById(int id) throws ModelNotFoundException {
       Optional<Model> dbModelOptional =  modelDAO.findById(id);
       if (!dbModelOptional.isPresent()){
           throw new ModelNotFoundException("No  Model found in DB with ID-"+id);
       }
        return dbModelOptional.get();
    }

    @Override
    public TrimType getTrimTypeById(int id) {
        return null;
    }
}















