package com.programacaomobile.androidsensor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacaomobile.androidsensor.dtos.SensorDto;
import com.programacaomobile.androidsensor.entity.Sensor;
import com.programacaomobile.androidsensor.mappers.SensorMapper;
import com.programacaomobile.androidsensor.repositories.SensorRepository;

@Service
public class SensorService {
	
	private SensorRepository repository;
	private SensorMapper mapper;
	
	@Autowired
	public SensorService(SensorRepository repository, SensorMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	public Sensor uploadSensor(SensorDto sensors) {
		return repository.save(mapper.toSensors(sensors));
	}

	public List<Sensor> listSensors() {
		return repository.findAll();
	}
}
