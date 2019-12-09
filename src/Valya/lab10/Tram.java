package Valya.lab10;

public class Tram extends Transport{
    public Tram() {
    }

    public Tram(int speed, double countPeople, String brand) {
        super(speed, countPeople, brand);
    }

    @Override
    String people() {
        return null;
    }

    @Override
    public double countDaySalary() {
        return 0;
    }

    @Override
    public String message() {
        return null;
    }

    @Override
    public int idPlusOdin() {
        return 0;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "speed=" + speed +
                ", countPeople=" + countPeople +
                ", brand='" + brand + '\'' +
                '}';
    }
}
