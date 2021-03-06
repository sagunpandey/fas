package com.kaushikkasaju.fas.repository;

import com.kaushikkasaju.fas.model.River;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RiverRepository extends CrudRepository<River, Integer>, CustomRiverRepository {
    River save(River river);
    List<River> findAll();
    River findById(Integer id);
}
