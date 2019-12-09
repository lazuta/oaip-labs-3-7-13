package Igor.lab10;

public class Engineer implements IEmployeeIntarface{
    private int userId;
    protected String name;
    protected double salary;

    public Engineer(int userId, String name, double salary) {
        this.userId = userId;
        this.name = name;
        this.salary = salary;
    }

    public Engineer() {

    }

    @Override
    public double countDaySalary() {
        return salary;
    }

    @Override
    public String message() {
        return name;
    }

    @Override
    public int idPlusOdin() {
        return userId + 1;
    }
}
