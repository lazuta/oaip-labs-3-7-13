package Luba.lab8.Task2;

public class Main {
    public static void main(String[] args) {
        Helmet c = new Helmet("IDOL", 120);
        Icon i = new Icon("Name", 100);

        int sum = i.getPrice() + c.getPrice();
        System.out.println("Total: " + sum);
    }
}
