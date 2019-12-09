package Valya.lab6;

import java.util.Date;

public class Space {
    protected int speed;
    protected double power;
    protected Date dateStart;
    protected String MASK;

    public Space() {}

    public Space(int speed, double power, Date dateStart, String MASK) {
        this.speed = speed;
        this.power = power;
        this.dateStart = dateStart;
        this.MASK = MASK;
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

    public void getMASK(int x) {}

    public void setMASK(String MASK) {
        this.MASK = MASK;
    }
}
