package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar(String carBrand, String carClass, int weight, Driver driver, Engine engine, int speed) {
        super(carBrand, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void printInfo() {
        System.out.println("Марка: " + getCarBrand() + "; Класс: " + getCarClass() + "; Вес: " + getWeight() + "; Скорость: " + getSpeed());
        System.out.println("Водитель: ");
        getDriver().printInfo();
        System.out.println("Двигатель: ");
        getEngine().printInfo();
    }
}
