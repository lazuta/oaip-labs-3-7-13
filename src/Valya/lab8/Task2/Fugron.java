package Valya.lab8.Task2;

public class Fugron {
    protected int countCoffee;
    protected double volume;
    protected String nameCoffee;
    protected String type;

    public Fugron() {}

    public Fugron(int countCoffee, double volume, String nameCoffee, String type) {
        this.countCoffee = countCoffee;
        this.volume = volume;
        this.nameCoffee = nameCoffee;
        this.type = type;
    }

    public int getCountCoffee() {
        return countCoffee;
    }

    public void setCountCoffee(int countCoffee) {
        this.countCoffee = countCoffee;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getNameCoffee() {
        return nameCoffee;
    }

    public void setNameCoffee(String nameCoffee) {
        this.nameCoffee = nameCoffee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected double countTotalVolume() {
        return volume * countCoffee;
    }

    protected double countTotalVolume(double volume) {
        return this.volume * countCoffee;
    }

    protected String message() {
        return "Кофе " + nameCoffee + " , тип " + type+ ".";
    }

    protected String message(String mess) {
        return mess;
    }

        @Override
    public String toString() {
        return "Fugron{" +
                "countCoffee=" + countCoffee +
                ", volume=" + volume +
                ", nameCoffee='" + nameCoffee + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
