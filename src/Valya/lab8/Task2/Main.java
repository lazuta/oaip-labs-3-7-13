package Valya.lab8.Task2;

import java.util.Arrays;

public class Main {
    private static Kofe[] coffe = new Kofe[3];

    public static void main(String[] args) {
        coffe[0] = new Kofe(10, 23.5, "Молотое", "BRAND");
        coffe[1] = new Kofe(30, 23.5, "Зерновое", "BRAND1");
        coffe[2] = new Kofe(20, 23.5, "Растворимый", "BRAND2");

        String[] price = new String[coffe.length];
        int c = 0;
        for (int i = 0; i <= coffe.length - 1; i++) {
            String str = coffe[i].countCoffee + " - " + coffe[i].nameCoffee;
            price[c] = str;
            c++;
        }

        Arrays.sort(price);

        for (int i = 0; i <= price.length - 1; i++) System.out.println(price[i]);
    }
}
