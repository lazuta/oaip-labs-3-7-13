package Igor.lab8;

public class Airplane {
    public String wing;
    public String brandChassing;
    public String engine;
    protected String route;

    public Airplane() {}

    public Airplane(String wing, String brandChassing, String engine, String route) {
        this.wing = wing;
        this.brandChassing = brandChassing;
        this.engine = engine;
        this.route = route;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public String getBrandChassing() {
        return brandChassing;
    }

    public void setBrandChassing(String brandChassing) {
        this.brandChassing = brandChassing;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String fly() {
        return "Летим!";
    }

    public String createRoute(){
        return "Маршрут построен! " + route;
    }

    public String showRoute() {
        String a = "X-----------X\n";
        String b = "|\n";
        String C = "X";
        return a;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "wing='" + wing + '\'' +
                ", brandChassing='" + brandChassing + '\'' +
                ", engine='" + engine + '\'' +
                ", route='" + route + '\'' +
                '}';
    }
}
