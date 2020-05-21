package com.programacaomobile.androidsensor.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SensorDto {
	
	private Integer humidity;
	private PositionDto position;
	private Double luminosity;
	private Double proximity;
	private Integer temperature;

}
