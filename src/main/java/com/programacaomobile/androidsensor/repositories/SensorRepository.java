package com.programacaomobile.androidsensor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programacaomobile.androidsensor.entity.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {

}
