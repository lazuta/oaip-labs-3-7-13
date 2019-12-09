package Igor.lab8;

public class Chassing extends Airplane{
    public String chassingP;
    public double price;

    public Chassing() {}

    public Chassing(String chassingP, double price) {
        this.chassingP = chassingP;
        this.price = price;
    }

    public Chassing(String wing, String brandChassing, String engine, String route, String chassingP, double price) {
        super(wing, brandChassing, engine, route);
        this.chassingP = chassingP;
        this.price = price;
    }

    public String getChassingP() {
        return chassingP;
    }

    public void setChassingP(String chassingP) {
        this.chassingP = chassingP;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Chassing(String wing, String brandChassing, String engine, String route) {
        super(wing, brandChassing, engine, route);
    }

    @Override
    public String getWing() {
        return super.getWing();
    }

    @Override
    public void setWing(String wing) {
        super.setWing(wing);
    }

    @Override
    public String getBrandChassing() {
        return super.getBrandChassing();
    }

    @Override
    public void setBrandChassing(String brandChassing) {
        super.setBrandChassing(brandChassing);
    }

    @Override
    public String getEngine() {
        return super.getEngine();
    }

    @Override
    public void setEngine(String engine) {
        super.setEngine(engine);
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
        return "Chassing{" +
                "chassingP='" + chassingP + '\'' +
                ", price=" + price +
                '}';
    }
}
