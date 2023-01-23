package com.modelaAi.api.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaAi.api.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
