package Luba.lab8.Task2;

public class Motorcycle extends Motorcyclist{
    protected String model;
    protected int price;

    public Motorcycle(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public Motorcycle(String name, int power, String model, int price) {
        super(name, power);
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    protected String search(int x) {
        if(this.price <= x)
            return this.model;
        else
            return "NO";
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
