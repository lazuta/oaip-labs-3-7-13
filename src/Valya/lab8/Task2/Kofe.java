package Valya.lab8.Task2;

public class Kofe extends Fugron{
    public Kofe() {
    }

    public Kofe(int countCoffee, double volume, String nameCoffee, String type) {
        super(countCoffee, volume, nameCoffee, type);
    }

    @Override
    public int getCountCoffee() {
        return super.getCountCoffee();
    }

    @Override
    public void setCountCoffee(int countCoffee) {
        super.setCountCoffee(countCoffee);
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

    @Override
    public void setVolume(double volume) {
        super.setVolume(volume);
    }

    @Override
    public String getNameCoffee() {
        return super.getNameCoffee();
    }

    @Override
    public void setNameCoffee(String nameCoffee) {
        super.setNameCoffee(nameCoffee);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    protected double countTotalVolume() {
        return super.countTotalVolume();
    }

    @Override
    protected double countTotalVolume(double volume) {
        return super.countTotalVolume(volume);
    }

    @Override
    protected String message() {
        return super.message();
    }

    @Override
    protected String message(String mess) {
        return super.message(mess);
    }

    @Override
    public String toString() {
        return "Kofe{" +
                "countCoffee=" + countCoffee +
                ", volume=" + volume +
                ", nameCoffee='" + nameCoffee + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
