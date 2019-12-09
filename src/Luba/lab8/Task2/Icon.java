package Luba.lab8.Task2;

public class Icon extends Motorcycle{
    Icon(String brand, int price) {
        super(brand, price);
        this.name = name;
    }

    public Icon(String name, int power, String brand, int price) {
        super(name, power, brand, price);
    }
}
