package Valya.lab8;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Array a = new Array(5, arr);

        a.pushing(6);
        System.out.println(a.addition());

    }
}
