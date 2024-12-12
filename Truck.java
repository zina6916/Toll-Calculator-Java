package Homeworks.Assignment25OOP3;

public class Truck extends Vehicle {
    private int noOfAxles;

    public Truck(double distanceTraveled, int noOfAxles) {
        super(distanceTraveled);
        this.noOfAxles = noOfAxles;
    }

    public int getNoOfAxles() {
        return noOfAxles;
    }

    public void setNoOfAxles(int noOfAxles) {
        this.noOfAxles = noOfAxles;
    }

    @Override
    void calculateToll() {
        if(noOfAxles == 4){
            setToll(getDistanceTraveled()*0.040);
        } else if (noOfAxles==6) {
setToll(getDistanceTraveled()*0.045);
        }
        else if (noOfAxles >=8){
            setToll(getDistanceTraveled()*0.048);

        }
    }

    @Override
    public String toString() {
        return "TOLL INFO:" + "\n" + "Vehicle type: Truck           Distance: " + getDistanceTraveled() + "         Toll amount: $" + getToll()
                + "\n";
    }
}
