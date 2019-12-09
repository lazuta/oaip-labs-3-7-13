package Valya.lab7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Boeing b =  new Boeing(1200, 213, date, "NoMask");
        Space s = new Space(2433, 213, date, "mask");
        Raptor r = new Raptor(6555, 1234, date, "no mas");
    }
}
