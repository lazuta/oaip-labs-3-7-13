package Igor.lab8;

public class Wing extends Airplane{
    public String brandChassing;
    public double price;

    public Wing() {}

    public Wing(String brandChassing, double price) {
        this.brandChassing = brandChassing;
        this.price = price;
    }

    public Wing(String wing, String brandChassing, String engine, String route, String brandChassing1, double price) {
        super(wing, brandChassing, engine, route);
        this.brandChassing = brandChassing1;
        this.price = price;
    }

    @Override
    public String getBrandChassing() {
        return brandChassing;
    }

    @Override
    public void setBrandChassing(String brandChassing) {
        this.brandChassing = brandChassing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        return "Wing{" +
                "brandChassing='" + brandChassing + '\'' +
                ", price=" + price +
                '}';
    }
}
