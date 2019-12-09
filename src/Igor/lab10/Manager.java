package Igor.lab10;

public class Manager extends Engineer{
    public Manager() {
        super();
    }

    public Manager(int userId, String name, double salary) {
        super(userId, name, salary);
    }

    @Override
    public double countDaySalary() {
        return super.countDaySalary();
    }

    @Override
    public String message() {
        return super.message();
    }

    @Override
    public int idPlusOdin() {
        return super.idPlusOdin();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
