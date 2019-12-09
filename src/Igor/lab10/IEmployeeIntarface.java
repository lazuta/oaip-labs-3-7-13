package Igor.lab10;

public interface IEmployeeIntarface {
    int userId = 0;
    String name = "Ф.И.О";
    double salary = 1000.0;

    abstract double countDaySalary();
    abstract String message();
    abstract int idPlusOdin();
}
