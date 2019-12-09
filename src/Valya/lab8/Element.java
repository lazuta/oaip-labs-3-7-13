package Valya.lab8;

public class Element extends Array{
    protected int el;

    public Element(int el) {
        this.el = el;
    }

    public Element(int length, int[] arr, int el) {
        super(length, arr);
        this.el = el;
    }

    public int getEl() {
        return el;
    }

    public void setEl(int el) {
        this.el = el;
    }

    @Override
    public void pushing(int x) {
        super.pushing(x);
    }

    @Override
    public String toString() {
        return "Element{" +
                "el=" + el +
                '}';
    }
}
