package Igor.lab8;

public class Engine extends Airplane{
    public String engineP;
    public double price;

    public Engine() {}

    public Engine(String engineP, double price) {
        this.engineP = engineP;
        this.price = price;
    }

    public Engine(String wing, String brandChassing, String engine, String route, String engineP, double price) {
        super(wing, brandChassing, engine, route);
        this.engineP = engineP;
        this.price = price;
    }

    public String getEngineP() {
        return engineP;
    }

    public void setEngineP(String engineP) {
        this.engineP = engineP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getRoute() {
        return super.getRoute();
    }

    @Override
    public void setRoute(String route) {
        super.setRoute(route);
    }

    @Override
    public String fly() {
        return super.fly();
    }

    @Override
    public String createRoute() {
        return super.createRoute();
    }

    @Override
    public String showRoute() {
        return super.showRoute();
    }

    @Override
    public String toString() {
        return "Wing{" +
                "brandChassing='" + brandChassing + '\'' +
                ", price=" + price +
                '}';
    }
}
