package com.programacaomobile.androidsensor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programacaomobile.androidsensor.entity.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {

}
