package com.mycompany.AutoMobiles.Converter;

import com.mycompany.AutoMobiles.Entity.AutomobileEntity;
import com.mycompany.AutoMobiles.Model.AutomobileModel;
import org.springframework.stereotype.Component;

@Component
public class AutomobileConverter {
    public AutomobileEntity convertToEntity(AutomobileModel auto) {
        AutomobileEntity AME = new AutomobileEntity();
        AME.setCarName(auto.getCarName());
        AME.setModel(auto.getModel());
        AME.setColor(auto.getColor());
        AME.setYearBuilt(auto.getYearBuilt());
        AME.setPrice(auto.getPrice());
        return AME;

    }

    public AutomobileModel convertToModel(AutomobileEntity AME) {
        AutomobileModel auto = new AutomobileModel();
        auto.setCarName(AME.getCarName());
        auto.setModel(AME.getModel());
        auto.setColor(AME.getColor());
        auto.setYearBuilt(AME.getYearBuilt());
        auto.setPrice(AME.getPrice());
        return auto;

    }
}