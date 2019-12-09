package Valya.lab9;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Boeing b =  new Boeing(1200, 213, date, "NoMask");
        Raptor r = new Raptor(6555, 1234, date, "no mas");
    }
}
