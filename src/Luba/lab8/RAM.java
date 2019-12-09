package Luba.lab8;

public class RAM extends PC{
    public int countBar;
    public int sizeBar;

    public RAM(int countBar, int sizeBar) {
        this.countBar = countBar;
        this.sizeBar = sizeBar;
    }

    public RAM(String name, double price, int count, int countBar, int sizeBar) {
        super(name, price, count);
        this.countBar = countBar;
        this.sizeBar = sizeBar;
    }

    public int getCountBar() {
        return countBar;
    }

    public void setCountBar(int countBar) {
        this.countBar = countBar;
    }

    public int getSizeBar() {
        return sizeBar;
    }

    public void setSizeBar(int sizeBar) {
        this.sizeBar = sizeBar;
    }

    @Override
    public String message(String message) {
        return super.message(message);
    }

    @Override
    public String toString() {
        return "RAM{" +
                "countBar=" + countBar +
                ", sizeBar=" + sizeBar +
                '}';
    }
}
