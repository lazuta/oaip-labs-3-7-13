package Luba.lab7;

public class Electronic {
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

    protected String message() {
        return name + " имеется: " + count + " по " + price + " $.";
    }

    protected double totalPrice() {
        return count * price;
    }

    protected double totalVes() {
        return count * ves;
    }

    protected double totalVes(int newVes) {
        return count * newVes;
    }
}
