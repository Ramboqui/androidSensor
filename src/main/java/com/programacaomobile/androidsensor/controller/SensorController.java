package com.programacaomobile.androidsensor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacaomobile.androidsensor.dtos.SensorDto;
import com.programacaomobile.androidsensor.entity.Sensor;
import com.programacaomobile.androidsensor.services.SensorService;

@RestController
@RequestMapping(value = "/api/v1/sensor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SensorController {

	private SensorService service;

	@Autowired
	public SensorController(SensorService service) {
		this.service = service;
	}

	@PostMapping("/uploadSensor")
	public ResponseEntity<Sensor> uploadSensors(@RequestBody SensorDto sensors) {
		System.out.println("---------------------------------");
		return ResponseEntity.ok().body(service.uploadSensor(sensors));
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Sensor>> getSensors() {
		return ResponseEntity.ok().body(service.listSensors());
	}

}
