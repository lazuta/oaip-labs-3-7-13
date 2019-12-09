package Valya.lab10;

import Igor.lab10.IEmployeeIntarface;

abstract class Transport implements IEmployeeIntarface {
    protected int speed;
    protected double countPeople;
    protected String brand;

    public Transport() {
    }

    public Transport(int speed, double countPeople, String brand) {
        this.speed = speed;
        this.countPeople = countPeople;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getCountPeople() {
        return countPeople;
    }

    public void setCountPeople(double countPeople) {
        this.countPeople = countPeople;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract String people();

    protected int speedVehicle() {
        return speed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "speed=" + speed +
                ", countPeople=" + countPeople +
                ", brand='" + brand + '\'' +
                '}';
    }
}
