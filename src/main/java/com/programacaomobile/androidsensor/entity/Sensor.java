package com.programacaomobile.androidsensor.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sensor")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sensor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer humidity;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "position_value")
	private Position position;
	private Double luminosity;
	private Double proximity;
	private Integer temperature;
	
}
