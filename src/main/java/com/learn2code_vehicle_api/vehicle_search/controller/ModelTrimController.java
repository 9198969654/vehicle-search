package com.learn2code_vehicle_api.vehicle_search.controller;

import com.learn2code_vehicle_api.vehicle_search.entity.Model;
import com.learn2code_vehicle_api.vehicle_search.entity.TrimType;
import com.learn2code_vehicle_api.vehicle_search.exception.ModelNotFoundException;
import com.learn2code_vehicle_api.vehicle_search.exception.TrimTypeNotFoundException;
import com.learn2code_vehicle_api.vehicle_search.service.impl.ModelTrimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/model-trim")
public class ModelTrimController {

    @Autowired
    private ModelTrimService modelTrimService;

    @PostMapping
    public ResponseEntity<Model> createComdelTrim(@RequestBody Model model) {
        Model savedRecord = modelTrimService.saveModel(model);
        return new ResponseEntity<>(savedRecord, HttpStatus.CREATED);
    }

    @PostMapping("/trim-type")
    public ResponseEntity<TrimType> createTrimType(@RequestBody TrimType trimType) {
        TrimType savedTrim = modelTrimService.saveTrimType(trimType);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTrim);
    }

    @GetMapping
    public ResponseEntity<List<Model>> fetchAllModels() {
        List<Model> dbModels = modelTrimService.getAllModels();
        if (dbModels.size() > 0) {
            return new ResponseEntity<>(dbModels, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Model> updateModel(@PathVariable int id, @RequestBody Model model) throws ModelNotFoundException {

//        Model dbModel = modelTrimService.modifyModel(id, model);
//        return ResponseEntity.ok(dbModel);

        Model dbModel = null;
        dbModel =   modelTrimService.modifyModel(id, model);
        return new ResponseEntity<>(dbModel, HttpStatus.OK);
    }

    @PutMapping("/{trim-type}/{id}")
    public ResponseEntity<TrimType> updateTrimType(@PathVariable int id, @RequestBody TrimType trimType) throws TrimTypeNotFoundException {
        TrimType dbTrim= modelTrimService.modifyTrimType(id, trimType);
        return ResponseEntity.ok(dbTrim);


    }

}


















