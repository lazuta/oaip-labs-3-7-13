package Luba.lab8.Task2;

public class Motorcyclist {
    protected String name;
    protected int power;

    public Motorcyclist() {}

    public Motorcyclist(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorcyclist{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
