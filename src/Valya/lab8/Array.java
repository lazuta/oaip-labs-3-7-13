package Valya.lab8;

import java.util.Arrays;

class Array {
    private int length;
    protected int arr[];

    public Array() {}

    public Array(int length, int[] arr) {
        this.length = length;
        this.arr = arr;
    }

    public void pushing(int x) {
        arr[arr.length-1] = x;
    }

    public void consoleOut() {
        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public int addition(){
        int sum = 0;
        for(int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int subtraction(){
        int sum = 0;
        for(int i = 0; i <= arr.length - 1; i++) {
            sum -= arr[i];
        }
        return sum;
    }

    public int multiplication(){
        int sum = 0;
        for(int i = 0; i <= arr.length - 1; i++) {
            sum -= arr[i];
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Array{" +
                "length=" + length +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
