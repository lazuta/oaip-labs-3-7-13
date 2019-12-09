package Luba.lab11.Pribory;

import Luba.lab11.Electronic;

public class Refrigerator extends Electronic {
    protected String name;
    protected double ves;
    protected double price;
    protected double count;

    public Refrigerator(String name, double ves, double price, double count) {
        super(name, ves, price, count);

        this.name = name;
        this.ves = ves;
        this.price = price;
        this.count = count;
    }

    public Refrigerator() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }


    public String message() {
        return super.message();
    }


    public double totalPrice() {
        return super.totalPrice();
    }


    public double totalVes() {
        return super.totalVes();
    }

    @Override
    protected double totalVes(int newVes) {
        return super.totalVes(newVes);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
