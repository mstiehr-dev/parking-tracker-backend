package com.mstiehr.repository;

import com.mstiehr.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;

public interface DriverRepository extends JpaRepository<Driver, Long>
{

    Driver findById(long id);
}
