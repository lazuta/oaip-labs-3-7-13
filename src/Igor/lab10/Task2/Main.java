package Igor.lab10.Task2;

public class Main {
    public static void main(String[] args) {
      Alko a =  new Alko("+- на глаз", 1000, 0.0001, false);
        System.out.println(a.message());

      Contact c = new Contact("Контактный 1", 100, 0.01, true);
        System.out.println(c.message());

      NoContact nc = new NoContact("Безконтактный", 100, 0.05, false);
        System.out.println(nc.message());
    }
}
