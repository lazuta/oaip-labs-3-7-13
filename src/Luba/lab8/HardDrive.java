package Luba.lab8;

public class HardDrive extends PC{
    public int volume;

    public HardDrive(int volume) {
        this.volume = volume;
    }

    public HardDrive(String name, double price, int count, int volume) {
        super(name, price, count);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String searchVirus() {
        return super.searchVirus();
    }

    @Override
    public String message(String message) {
        return "Объем диска - " + volume;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "volume=" + volume +
                '}';
    }
}
