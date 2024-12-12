package Homeworks.Assignment25OOP3;

import java.sql.SQLOutput;

public class PoliceCruiser extends Vehicle{

    public PoliceCruiser(double distanceTraveled) {
        super(distanceTraveled);
    }

    @Override
    void calculateToll() {
        setToll(0.0);
      //  System.out.println( "Police cars get to drive free on the toll road: " + getToll());

    }

    @Override
    public String toString() {
        return "TOLL INFO:" + "\n" + "Vehicle type: Police Cruiser           Distance: " + getDistanceTraveled() + "         Toll amount: $" + getToll()
                + "\n";
    }
}
