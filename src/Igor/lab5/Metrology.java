package Igor.lab5;

public class Metrology {
    protected String name;
    protected int value;
    protected double step;
    protected boolean use = false;

    protected Metrology(){}

    protected Metrology(String name, int value, double step, boolean use) {
        this.name = name;
        this.value = value;
        this.step = step;
        this.use = use;
    }

    protected String message() {
        if(use) {
            return "Измерение произведено с помощью " + name;
        } else {
            return "Невозможно произвести измеренеи";
        }
    }

    protected double doStep() {
        return step;
    }

    protected double maxValue () {
        return value;
    }
}
