package Igor.lab10.Task2;

public class Contact extends Metrology {
    protected String name;
    protected int value;
    protected double step;
    protected boolean use = false;

    public Contact() {}

    public Contact(String name, int value, double step, boolean use, String name1, int value1, double step1, boolean use1) {
        super(name, value, step, use);
        this.name = name1;
        this.value = value1;
        this.step = step1;
        this.use = use1;
    }

    public Contact(String s, int i, double v, boolean b) {
        this.name = s;
        this.value = i;
        this.step = v;
        this.use = b;
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

    protected double returnDouble(double step) {
        return step;
    }

    protected void returnDouble() {}

    protected String message() {
        return super.message();
    }

    protected double doStep() {
        return super.doStep();
    }

    protected double maxValue() {
        return super.maxValue();
    }


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
