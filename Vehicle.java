package Homeworks.Assignment25OOP3;

abstract class Vehicle {
    private double toll;
    private double distanceTraveled;

    protected Vehicle(  double distanceTraveled) {

        this.distanceTraveled = distanceTraveled;
    }

    public double getToll() {
        return toll;
    }

    public void setToll(double toll) {
        this.toll = toll;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;

    }


 //- calculateToll() - abstract method with void return type.
 abstract void calculateToll();

 }

