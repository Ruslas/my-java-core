package com.company.professions;


import lesson7.homework.Person;

public class Driver extends Person {
    private int drivingExperience;

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    public Driver() {
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public void printInfo() {
        super.printPerson();
        System.out.println(". Стаж: " + getDrivingExperience());
    }
}
