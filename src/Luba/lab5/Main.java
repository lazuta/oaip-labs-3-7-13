package Luba.lab5;

public class Main {
    public static void main(String[] args) {
        Blender b = new Blender("Б-123", 1200, 120, 2);
        Monitor m =  new Monitor("Samsung s12+", 2460, 540, 1);
        Refrigerator r = new Refrigerator("ATLANT K12", 10340, 235, 1);

        System.out.println(b.message());
        System.out.println(m.message());
        System.out.println(r.message());
    }
}
