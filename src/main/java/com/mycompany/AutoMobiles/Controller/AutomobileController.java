package com.mycompany.AutoMobiles.Controller;

import com.mycompany.AutoMobiles.Model.AutomobileModel;
import com.mycompany.AutoMobiles.Service.AutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/A1")
public class AutomobileController {
    @Autowired
    public AutomobileService service;

    @PostMapping("/data")
    public ResponseEntity<AutomobileModel> SaveAutomobile(@RequestBody AutomobileModel auto) {
        service.save(auto);
        ResponseEntity<AutomobileModel> response = new ResponseEntity<>(auto, HttpStatus.CREATED);
        return response;
    }

    @GetMapping("/data")
    public ResponseEntity<List<AutomobileModel>> getAll() {
        List<AutomobileModel> model = service.getAll();
        ResponseEntity<List<AutomobileModel>> response = new ResponseEntity<>(model, HttpStatus.OK);
        return response;
    }

    @PutMapping("/data/update/{propertyId}")
    public ResponseEntity<AutomobileModel> updateAll(@RequestBody AutomobileModel auto, @PathVariable Integer propertyId) {
       auto= service.updateAll(auto, propertyId);
        ResponseEntity<AutomobileModel> response = new ResponseEntity<>(auto, HttpStatus.OK);
        return response;
    }

    @PatchMapping("/data/CarNameupdate/{propertyId}")
    public ResponseEntity<AutomobileModel> updateCarName(@RequestBody AutomobileModel auto, @PathVariable Integer propertyId) {
        auto = service.updateCarName(auto, propertyId);
        ResponseEntity<AutomobileModel> response = new ResponseEntity<>(auto, HttpStatus.OK);
        return response;

    }
    @PatchMapping("/data/Modelupdate/{propertyId}")
    public ResponseEntity<AutomobileModel> updateModel(@RequestBody AutomobileModel auto, @PathVariable Integer propertyId) {
        auto = service.updateModel(auto, propertyId);
        ResponseEntity<AutomobileModel> response = new ResponseEntity<>(auto, HttpStatus.OK);
        return response;

    }
    @PatchMapping("/data/Colorupdate/{propertyId}")
    public ResponseEntity<AutomobileModel> updateColor(@RequestBody AutomobileModel auto, @PathVariable Integer propertyId) {
        auto = service.updateColor(auto, propertyId);
        ResponseEntity<AutomobileModel> response = new ResponseEntity<>(auto, HttpStatus.OK);
        return response;

    }
    @PatchMapping("/data/PriceUpdate/{propertyID}")
    public ResponseEntity<AutomobileModel> updatePrice(@RequestBody AutomobileModel auto,@PathVariable Integer propertyID){
        auto = service.updatePrice(auto, propertyID);
        ResponseEntity<AutomobileModel>response = new ResponseEntity<>(auto,HttpStatus.OK);
        return response;
    }
    @PatchMapping("/data/YearbuiltUpdate/{propertyID}")
    public ResponseEntity<AutomobileModel> UpdateYearBuilt(@RequestBody AutomobileModel auto,@PathVariable Integer propertyID){
       auto = service.updateCarYearbuilt(auto, propertyID);
        ResponseEntity<AutomobileModel>response = new ResponseEntity<>(auto,HttpStatus.OK);
        return response;
    }
    @DeleteMapping("/data/delete/{propertyID}")
    public ResponseEntity<AutomobileModel> Delete(@PathVariable Integer propertyID){
     service.Delete( propertyID);
        ResponseEntity<AutomobileModel>response = new ResponseEntity<>(null,HttpStatus.OK);
        return response;
    }
}