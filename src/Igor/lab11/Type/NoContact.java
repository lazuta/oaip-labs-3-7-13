package Igor.lab11.Type;

import Igor.lab11.Metrology;

public class NoContact extends Metrology {
    protected String name;
    protected int value;
    protected double step;
    protected boolean use = false;

    public NoContact() {
    }

    public NoContact(String name, int value, double step, boolean use) {
        super(name, value, step, use);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public double getStep() {
        return step;
    }

    public boolean isUse() {
        return use;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public void setUse(boolean use) {
        this.use = use;
    }

    public String message() {
        return super.message();
    }

    public double doStep() {
        return super.doStep();
    }

    public double maxValue() {
        return super.maxValue();
    }

    protected double returnDouble(double step) {
        return step;
    }

    protected void returnDouble() {}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected double maxValue(double newValue) {
        return super.maxValue(newValue);
    }
}
