package Valya.lab10.Task2;

import java.util.Date;

public class Raptor implements Space {
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
        this.speed = speed1;
        this.power = power1;
        this.dateStart = dateStart1;
        this.MASK = MASK1;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public Date getDateStart() {
        return dateStart;
    }

    @Override
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Override
    public String getMASK() {
        return MASK;
    }

    @Override
    public void getMASK(int x) {

    }

    @Override
    public void setMASK(String MASK) {
        this.MASK = MASK;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
