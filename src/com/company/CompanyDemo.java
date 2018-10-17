package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class CompanyDemo {
    public static void main(String[] args) {
        Engine engine1 = new Engine(1200, "Toyta");
        Driver driver1 = new Driver("Sidorenko Vasiliy Petrovich", 32, 5);
        Car car1 = new Car("Tota", "D", 1000, driver1, engine1);
        Lorry lorry1 = new Lorry("VAZ", "E", 2000, driver1, engine1, 700);
        SportCar sportCar1 = new SportCar("Laba", "C", 1000, driver1, engine1, 320);

        car1.start();
        car1.turnLeft();
        car1.turnRight();
        car1.stop();
        car1.printInfo();
        lorry1.printInfo();
        sportCar1.printInfo();
    }
}
