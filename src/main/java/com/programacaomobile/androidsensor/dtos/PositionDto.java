package com.programacaomobile.androidsensor.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositionDto {
	
	private Double latitude;
	private Double longitude;

}
