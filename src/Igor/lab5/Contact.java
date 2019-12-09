package Igor.lab5;

public class Contact extends Metrology{
    protected String name;
    protected int value;
    protected double step;
    protected boolean use = false;

    public Contact(String name, int value, double step, boolean use) {
        this.name = name;
        this.value = value;
        this.step = step;
        this.use = use;
    }

    public Contact(String name, int value, double step, boolean use, String name1, int value1, double step1, boolean use1) {
        super(name, value, step, use);
        this.name = name1;
        this.value = value1;
        this.step = step1;
        this.use = use1;
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

    protected Contact() {
        super();
    }


    protected String message() {
        return super.message();
    }


    protected double doStep() {
        return super.doStep();
    }


    protected double maxValue() {
        return super.maxValue();
    }
}
