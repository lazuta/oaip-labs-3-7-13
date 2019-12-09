package Luba.lab8;

public class Main {
    public static void main(String[] args) {
        HardDrive hd =  new HardDrive("SSD Samsung 1TB", 240, 2, 1000);

        System.out.println(hd.message("Объем"));
    }
}
