package Luba.lab7;

public class Blender extends Electronic {
    protected String name;
    protected double ves;
    protected double price;
    protected double count;

    public Blender(String name, double ves, double price, double count) {
        this.name = name;
        this.ves = ves;
        this.price = price;
        this.count = count;
    }

    public Blender(String name, double ves, double price, double count, String name1, double ves1, double price1, double count1) {
        super(name, ves, price, count);
        this.name = name1;
        this.ves = ves1;
        this.price = price1;
        this.count = count1;
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


    protected String message() {
        return super.message();
    }


    protected double totalPrice() {
        return super.totalPrice();
    }


    protected double totalVes() {
        return 0;
    }

    protected double totalVes(double les) {
        return les;
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
