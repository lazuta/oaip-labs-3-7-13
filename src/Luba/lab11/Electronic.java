package Luba.lab11;

import Luba.lab11.Interface.INameInterface;

public class Electronic implements INameInterface {
    protected String name;
    protected double ves;
    protected double price;
    protected double count;

    public Electronic() {}

    public Electronic(String name, double ves, double price, double count) {
        this.name = name;
        this.ves = ves;
        this.price = price;
        this.count = count;
    }

    public String message() {
        return name + " имеется: " + count + " по " + price + " $.";
    }

    public double totalPrice() {
        return count * price;
    }

    public double totalVes() {
        return count * ves;
    }

    protected double totalVes(int newVes) {
        return count * newVes;
    }
}
