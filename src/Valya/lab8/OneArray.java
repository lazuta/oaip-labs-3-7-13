package Valya.lab8;

import java.util.Arrays;

public class OneArray extends Array{
    protected int arr[];

    public OneArray(int[] arr) {
        this.arr = arr;
    }

    public OneArray(int length, int[] arr, int[] arr1) {
        super(length, arr);
        this.arr = arr1;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void pushing(int x) {
        super.pushing(x);
    }

    @Override
    public void consoleOut() {
        super.consoleOut();
    }

    @Override
    public int addition() {
        return super.addition();
    }

    @Override
    public int subtraction() {
        return super.subtraction();
    }

    @Override
    public int multiplication() {
        return super.multiplication();
    }

    @Override
    public String toString() {
        return "OneArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
