package Valya.lab5;

import java.util.Date;

public class Raptor extends Space{
    protected int speed;
    protected double power;
    protected Date dateStart;
    protected String MASK;

    public Raptor(int speed, double power, Date dateStart, String MASK) {
        this.speed = speed;
        this.power = power;
        this.dateStart = dateStart;
        this.MASK = MASK;
    }

    public Raptor(int speed, double power, Date dateStart, String MASK, int speed1, double power1, Date dateStart1, String MASK1) {
        super(speed, power, dateStart, MASK);
        this.speed = speed1;
        this.power = power1;
        this.dateStart = dateStart1;
        this.MASK = MASK1;
    }


    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public double getPower() {
        return power;
    }


    public void setPower(double power) {
        this.power = power;
    }


    public Date getDateStart() {
        return dateStart;
    }


    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }


    public String getMASK() {
        return MASK;
    }


    public void setMASK(String MASK) {
        this.MASK = MASK;
    }
}
