package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String carBrand, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(carBrand, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public void printInfo() {
        System.out.println("Марка: " + getCarBrand() + "; Класс: " + getCarClass() + "; Вес: " + getWeight() + "; Грузоподъемность: " + getCarrying());
        System.out.println("Водитель: ");
        getDriver().printInfo();
        System.out.println("Двигатель: ");
        getEngine().printInfo();
    }
}
