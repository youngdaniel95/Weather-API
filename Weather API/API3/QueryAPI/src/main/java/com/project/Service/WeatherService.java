package com.project.Service;

import com.project.DAO.WeatherRepository;
import com.project.DTO.ModelDTO;
import com.project.Models.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    WeatherRepository weatherRepository;

    /**
     * @param weatherRepository Autowired Repository
     */
    @Autowired
    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    /**
     * @param weather Saves all weather data requested from API into the database.
     */
    public void save(ModelDTO weather) {
        Weather newWeather = new Weather();
        newWeather.setDate(weather.getDate());
        newWeather.setTemperature(weather.getTemperature());
        newWeather.setFeelsLike(weather.getFeelsLike());
        newWeather.setPressure(weather.getPressure());
        newWeather.setHumidity(weather.getHumidity());
        newWeather.setWindSpeed(weather.getWindSpeed());
        newWeather.setDescription(weather.getDescription());
        newWeather.setRequests(weather.getRequest());
        weatherRepository.save(newWeather);
    }

}
