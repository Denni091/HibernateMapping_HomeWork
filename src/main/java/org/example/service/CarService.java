package org.example.service;

import org.example.dao.CarDao;
import org.example.entity.Car;

public class CarService {
    private CarDao carDao = new CarDao();
    public void save(Car car) {
        System.out.println("Car for save: " + car.toString());
        carDao.save(car);
    }
}
