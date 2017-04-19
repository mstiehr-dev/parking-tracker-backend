package com.mstiehr.controller;

import com.mstiehr.model.Car;
import com.mstiehr.model.Driver;
import com.mstiehr.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/drivers")
public class DriverController
{
    @Autowired
    private DriverRepository driverRepository;

    @ResponseBody
    @RequestMapping("/all")
    public Collection<Driver> getAllDrivers()
    {
        // todo: look up what's exactly happening here
        Collection<Driver> allDrivers = driverRepository.findAll();

        return allDrivers;
    }

    @ResponseBody
    @RequestMapping("/{driverId}")
    public Driver getById(@PathVariable long driverId)
    {
        Driver d = driverRepository.findById(driverId);

        return d;
    }

    @ResponseBody
    @RequestMapping("/{driverId}/cars")
    public Collection<Car> getCarsByDriverId(@PathVariable long driverId)
    {
        Driver driver = driverRepository.findById(driverId);

        return null != driver ? driver.getCars() : Collections.EMPTY_LIST;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addDriverForm()
    {
        // return form (maybe even thymeleaf template?
        StringBuilder sb = new StringBuilder();

        sb.append("<form method='POST'>\n");
        sb.append(  "<input type='text' name='username' value='username'/>\n");
        sb.append(  "<input type='text' name='email' value='email'/>\n");
        sb.append(  "<input type='text' name='password'value='password'/>\n");
        sb.append(  "<input type='submit' value='go'/>\n");
        sb.append("</form>\n");

        return sb.toString();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addDriver(@RequestParam String email, @RequestParam String username, @RequestParam String password)
    {
        try
        {
            Driver driver = new Driver();
            driver.setEmail(email);
            driver.setUsername(username);
            driver.setPassword(password);

            driverRepository.save(driver);

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
