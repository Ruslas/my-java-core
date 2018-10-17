package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class CompanyDemo {
    public static void main(String[] args) {
        Engine engine1 = new Engine(1200, "Toyta");
        Driver driver1 = new Driver("Sidorenko Vasiliy Petrovich", 32, 5);
        Car car1 = new Car("Tota", "C", 1000, driver1, engine1);

        car1.start();
        car1.turnLeft();
        car1.turnRight();
        car1.stop();
        car1.printInfo();
    }
}
