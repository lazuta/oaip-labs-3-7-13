package Luba.lab8.Task2;

public class Clothes extends Motorcyclist{
    protected String brand;
    protected int price;

    public Clothes(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Clothes(String name, int power, String brand, int price) {
        super(name, power);
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    protected String search(int x) {
        if(this.price <= x)
            return this.brand;
        else
            return "NO";
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
