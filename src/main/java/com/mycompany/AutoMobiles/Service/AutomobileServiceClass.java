package com.mycompany.AutoMobiles.Service;

import com.mycompany.AutoMobiles.Converter.AutomobileConverter;
import com.mycompany.AutoMobiles.Entity.AutomobileEntity;
import com.mycompany.AutoMobiles.Model.AutomobileModel;
import com.mycompany.AutoMobiles.Repository.AutomobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AutomobileServiceClass implements AutomobileService {
    @Autowired
   public AutomobileConverter automobileConverter;
    @Autowired
    public AutomobileRepository automobileRepository;
    @Override
    public AutomobileModel save(AutomobileModel auto) {
        AutomobileEntity AME = automobileConverter.convertToEntity(auto);
        AME =automobileRepository.save(AME);
auto = automobileConverter.convertToModel(AME);
        return null;
    }

    @Override
    public List<AutomobileModel> getAll() {
        List<AutomobileEntity> list = (List<AutomobileEntity>)automobileRepository.findAll();
        List<AutomobileModel>modelList = new ArrayList<>();
        for(AutomobileEntity AE:list){
            AutomobileModel model = automobileConverter.convertToModel(AE);
            modelList.add(model);

        }

        return modelList;
    }

    @Override
    public AutomobileModel updateAll(AutomobileModel auto, Integer id) {
        AutomobileModel automodel=null;
        Optional<AutomobileEntity> opt = automobileRepository.findById(id);
        if(opt.isPresent()) {
            AutomobileEntity Ae = opt.get();
            Ae.setCarName(auto.getCarName());
            Ae.setModel(auto.getModel());
            Ae.setColor(auto.getColor());
            Ae.setPrice(auto.getPrice());
            Ae.setYearBuilt(auto.getYearBuilt());
         automodel = automobileConverter.convertToModel(Ae);
         automobileRepository.save(Ae);
        }
        return automodel;
    }

    @Override
    public AutomobileModel updateCarName(AutomobileModel auto, Integer id) {
        AutomobileModel automobileModel = null;
        Optional<AutomobileEntity> opt = automobileRepository.findById(id);
        if(opt.isPresent()){
            AutomobileEntity Ae = opt.get();
            Ae.setCarName(auto.getCarName());
            automobileModel =automobileConverter.convertToModel(Ae);
            automobileRepository.save(Ae);
        }
        return automobileModel;
    }

    @Override
    public AutomobileModel updateModel(AutomobileModel auto, Integer id) {
        AutomobileModel automobileModel = null;
        Optional<AutomobileEntity> opt = automobileRepository.findById(id);
        if(opt.isPresent()){
            AutomobileEntity Ae= opt.get();
            Ae.setModel(auto.getModel());
            automobileModel=automobileConverter.convertToModel(Ae);
            automobileRepository.save(Ae);
        }
        return automobileModel;
    }

    @Override
    public AutomobileModel updateColor(AutomobileModel auto, Integer id) {
        AutomobileModel automobileModel = null;
        Optional<AutomobileEntity> opt = automobileRepository.findById(id);
        if(opt.isPresent()){
            AutomobileEntity Ae= opt.get();
            Ae.setColor(auto.getColor());
            automobileModel=automobileConverter.convertToModel(Ae);
            automobileRepository.save(Ae);
        }
        return automobileModel;
    }

    @Override
    public AutomobileModel updatePrice(AutomobileModel auto, Integer id) {
        AutomobileModel automobileModel = null;
        Optional<AutomobileEntity> opt = automobileRepository.findById(id);
        if(opt.isPresent()){
            AutomobileEntity Ae= opt.get();
            Ae.setPrice(auto.getPrice());
            automobileModel=automobileConverter.convertToModel(Ae);
            automobileRepository.save(Ae);
        }
        return automobileModel;
    }

    @Override
    public AutomobileModel updateCarYearbuilt(AutomobileModel auto, Integer id) {
        AutomobileModel automobileModel = null;
        Optional<AutomobileEntity> opt = automobileRepository.findById(id);
        if(opt.isPresent()){
            AutomobileEntity Ae= opt.get();
            Ae.setYearBuilt(auto.getYearBuilt());
            automobileModel=automobileConverter.convertToModel(Ae);
            automobileRepository.save(Ae);
        }
        return automobileModel;
    }

    @Override
    public void Delete(Integer ID) {
       automobileRepository.deleteById(ID);

    }
}