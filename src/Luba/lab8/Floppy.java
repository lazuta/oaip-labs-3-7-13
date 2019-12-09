package Luba.lab8;

public class Floppy extends PC{
    private double size;

    public Floppy(double size) {
        this.size = size;
    }

    public Floppy(String name, double price, int count, double size) {
        super(name, price, count);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String message(String message) {
        return super.message(message);
    }

    @Override
    public String toString() {
        return "Floppy{" +
                "size=" + size +
                '}';
    }
}
