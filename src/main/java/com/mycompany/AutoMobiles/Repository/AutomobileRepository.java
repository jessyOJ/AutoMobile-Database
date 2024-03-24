package com.mycompany.AutoMobiles.Repository;

import com.mycompany.AutoMobiles.Entity.AutomobileEntity;
import org.springframework.data.repository.CrudRepository;

public interface AutomobileRepository extends CrudRepository<AutomobileEntity,Integer> {
}
