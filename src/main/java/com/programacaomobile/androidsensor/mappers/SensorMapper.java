package com.programacaomobile.androidsensor.mappers;

import org.springframework.stereotype.Component;

import com.programacaomobile.androidsensor.dtos.PositionDto;
import com.programacaomobile.androidsensor.dtos.SensorDto;
import com.programacaomobile.androidsensor.entity.Position;
import com.programacaomobile.androidsensor.entity.Sensor;

@Component
public class SensorMapper {
	
	public Sensor toSensors(SensorDto sensor) {
		return Sensor.builder()
				.humidity(sensor.getHumidity())
				.luminosity(sensor.getLuminosity())
				.position(toPosition(sensor.getPosition()))
				.proximity(sensor.getProximity())
				.temperature(sensor.getTemperature())
				.build();
	}
	
	public Position toPosition(PositionDto position) {
		return Position.builder()
				.latitude(position.getLatitude())
				.longitude(position.getLongitude())
				.build();
	}
	

}
