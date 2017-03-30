package com.mstiehr.repository;

import com.mstiehr.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public interface CarRepository extends JpaRepository<Car, Long>
{
    Car findById(long id);
}
