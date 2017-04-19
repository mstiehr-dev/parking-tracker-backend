package com.mstiehr.controller;

import com.mstiehr.model.Car;
import com.mstiehr.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@RestController
@RequestMapping("cars")
public class CarController
{
    @Autowired
    CarRepository carRepository;

    @ResponseBody
    @RequestMapping(value = "/all")
    public Collection<Car> getAllCars()
    {
        Collection<Car> allCars = carRepository.findAll();

        return allCars;
    }

    @ResponseBody
    @RequestMapping(value = "/{carId}")
    public Car getById(@PathVariable long carId)
    {
        Car c = carRepository.findById(carId);

        return c;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCarForm()
    {   // return form (maybe even thymeleaf template?)
        StringBuilder sb = new StringBuilder();

        sb.append("<form method='POST'>\n");
        sb.append(  "<input type='text' name='description' value='description'/>\n");
        sb.append(  "<input type='text' name='latitudeS'value='latitude'/>\n");
        sb.append(  "<input type='text' name='longitudeS' value='longitude'/>\n");
        sb.append(  "<input type='submit' value='go'/>\n");
        sb.append("</form>\n");

        return sb.toString();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCar(@RequestParam String description, @RequestParam String latitudeS, @RequestParam String longitudeS)
    {
        try
        {
            double latitude = Double.parseDouble(latitudeS);
            double longitude = Double.parseDouble(longitudeS);

            Car car = new Car();
            car.setDescription(description);
            car.setLatitude(latitude);
            car.setLongitude(longitude);

            carRepository.save(car);

            // todo: return success page
            return "SUCCESS";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            // todo: return error page
            return "ERROR";
        }
    }
}
