package repeat.repeat15.hierarchy;

import static repeat.repeat15.hierarchy.CarException.INCORRECT_SPEED;
import static repeat.repeat15.hierarchy.CarException.INCORRECT_YEAR;

public abstract class PassengerCar implements Car {
    private int year;
    private String brand;
    private int maxSpeed;
    private int acceleration;
    private int currentSpeed;

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws CarException {
        if (year < 1800 | year > 2020)
            throw new CarException(INCORRECT_YEAR);
        this.year = year;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) throws CarException {
        if (maxSpeed > 500 | maxSpeed < 0)
            throw new CarException(INCORRECT_SPEED);
        this.maxSpeed = maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void turnLeft() {
        System.out.println(brand + " turn left");
    }

    @Override
    public void turnRight() {
        System.out.println(brand + " turn right");
    }

    @Override
    public boolean speedUp(int s) {
        if (currentSpeed + s <= maxSpeed) {
            currentSpeed += s;
            System.out.println(brand + " speed up");
            return true;
        }
        return false;
    }

    @Override
    public boolean speedDown(int s) {
        if (currentSpeed - s >= 0) {
            currentSpeed -= s;
            System.out.println(brand + " speed down");
            return true;
        } else if (currentSpeed >= 0) {
            currentSpeed = 0;
            System.out.println(brand + " speed down");
            return true;
        } else {
            System.out.println(brand + " speed is already 0");
            return false;
        }
    }

    @Override
    public boolean unload() {
        return false;
    }

    public static class Builder{
        private GermanCar newGermanCar;

        public Builder(){
            newGermanCar = new GermanCar();
        }

        public Builder withYear(int year) throws CarException{
            newGermanCar.setYear(year);
            return this;
        }

        public Builder withBrand(String brand) {
            newGermanCar.setBrand(brand);
            return this;
        }

        public Builder withMaxSpeed(int maxSpeed) throws CarException{
            newGermanCar.setMaxSpeed(maxSpeed);
            return this;
        }

        public Builder withAcceleration(int acceleration) {
            newGermanCar.setAcceleration(acceleration);
            return this;
        }

        public Builder withCurrentSpeed() {
            newGermanCar.setCurrentSpeed(0);
            return this;
        }

        public GermanCar build(){
            return newGermanCar;
        }
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", acceleration=" + acceleration +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
