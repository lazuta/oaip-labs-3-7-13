package Luba.lab8;

public class PC {
    protected String name;
    protected double price;
    protected int count;

    public PC() {}

    public PC(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String on(){
        return "PC - ON";
    }

    public String on(boolean x){
        if(x)
            return "PC - ON";
        else
            return "PC - OFF";

    }

    public String searchVirus() {
        return "Проверка на вирусы выполенена.";
    }

    public String message() {
        return "Система активна.";
    }

    public String message(String message) {
        return message;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
