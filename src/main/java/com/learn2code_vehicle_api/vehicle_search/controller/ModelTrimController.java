package com.learn2code_vehicle_api.vehicle_search.controller;

import com.learn2code_vehicle_api.vehicle_search.entity.Model;
import com.learn2code_vehicle_api.vehicle_search.service.impl.ModelTrimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/model-trim")
public class ModelTrimController {

    @Autowired
    private ModelTrimService modelTrimService;

    @PostMapping
    public ResponseEntity<Model> createComdelTrim(@RequestBody Model model){
      Model savedRecord =   modelTrimService.saveModel(model);
      return new ResponseEntity<>(savedRecord, HttpStatus.CREATED);
    }
}
