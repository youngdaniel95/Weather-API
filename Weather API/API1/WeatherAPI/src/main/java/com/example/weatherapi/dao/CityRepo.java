package com.example.weatherapi.dao;

import com.example.weatherapi.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City, Integer> {
    City getByCityName(String cityName);
}
