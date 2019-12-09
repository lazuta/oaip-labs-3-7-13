package Luba.lab8;

public class Processor extends PC{
    protected String model;
    protected int countCore;

    public Processor(String model, int countCore) {
        this.model = model;
        this.countCore = countCore;
    }

    public Processor(String name, double price, int count, String model, int countCore) {
        super(name, price, count);
        this.model = model;
        this.countCore = countCore;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCountCore() {
        return countCore;
    }

    public void setCountCore(int countCore) {
        this.countCore = countCore;
    }

    @Override
    public String on(boolean x) {
        return super.on(x);
    }

    @Override
    public String message(String message) {
        return super.message(message);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", countCore=" + countCore +
                '}';
    }
}
