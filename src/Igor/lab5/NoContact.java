package Igor.lab5;

public class NoContact extends Metrology{
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
