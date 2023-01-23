package com.modelaAi.api.constrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaAi.api.DTOs.CarDTO;
import com.modelaAi.api.models.Car;
import com.modelaAi.api.repositeries.CarRepository;

@RestController
@RequestMapping("/api/car")
public class Carcontroller {
    
    @Autowired
    private CarRepository repository;

    @PostMapping
    public void create(@RequestBody CarDTO req){
        repository.save(new Car(req));
    }

    @GetMapping
    public List<Car> listAll() {
        return repository.findAll();
    }
}
