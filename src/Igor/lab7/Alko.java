package Igor.lab7;

public class Alko extends Metrology {
    protected String name;
    protected int value;
    protected double step;
    protected boolean use = false;

    public Alko() {}

    public Alko(String name, int value, double step, boolean use) {
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


    protected String message() {
        return "Измерения в данном режиме не точнфыафытыф";
    }


    protected double doStep() {
        return 100500;
    }


    protected double maxValue() {
        return 352897;
    }

    protected double returnDouble(double step) {
        return step;
    }

    protected void returnDouble() {}

    @Override
    protected double maxValue(double newValue) {
        return super.maxValue(newValue);
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
    public String toString() {
        return super.toString();
    }


}
