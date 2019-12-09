package Valya.lab9;

import java.util.Date;

interface Space {
    int speed = 0;
    double power = 0;
    Date date = new Date();
    Date dateStart = date;
    String MASK = "a";
    int getSpeed() ;

    void setSpeed(int speed);

    double getPower();

    void setPower(double power);

    Date getDateStart() ;

    void setDateStart(Date dateStart);

    String getMASK();

    void getMASK(int x);

    void setMASK(String MASK);
}
