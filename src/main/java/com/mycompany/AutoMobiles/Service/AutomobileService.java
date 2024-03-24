package com.mycompany.AutoMobiles.Service;

import com.mycompany.AutoMobiles.Entity.AutomobileEntity;
import com.mycompany.AutoMobiles.Model.AutomobileModel;

import java.util.List;

public interface AutomobileService {
    public AutomobileModel save(AutomobileModel auto);

    List<AutomobileModel> getAll();

    AutomobileModel updateAll(AutomobileModel auto ,Integer id);
    AutomobileModel updateCarName(AutomobileModel auto ,Integer id);

    AutomobileModel updateModel(AutomobileModel auto ,Integer id);
    AutomobileModel updateColor(AutomobileModel auto ,Integer id);

    AutomobileModel updatePrice(AutomobileModel auto ,Integer id);
    AutomobileModel updateCarYearbuilt(AutomobileModel auto ,Integer id);

   void  Delete(Integer id);
}
