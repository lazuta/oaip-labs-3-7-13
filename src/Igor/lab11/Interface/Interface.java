package Igor.lab11.Interface;

public interface Interface {
     String name = "";
     int value = 0;
     double step = 0.1;
     boolean use = false;

    String message();
    double doStep();
    double maxValue();

}
