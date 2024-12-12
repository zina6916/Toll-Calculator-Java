package Homeworks.Assignment25OOP3;

public class Car extends Vehicle {

    private boolean hasTrailer;
    private boolean isHov;

    public Car(double distanceTraveled, boolean hasTrailer, boolean isHov) {
        super(distanceTraveled);
        this.hasTrailer = hasTrailer;
        this.isHov = isHov;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public boolean isHov() {
        return isHov;
    }

    public void setHov(boolean hov) {
        isHov = hov;
    }

    @Override
    void calculateToll() {

        if (isHov) {
            setToll(0.00);
        } else if (hasTrailer) {
            setToll((getDistanceTraveled() * 0.020) + 1);
        } else {
            setToll(getDistanceTraveled() * 0.020);
        }
    }



        public String toString () {
            return "TOLL INFO:" + "\n" +
                    "Vehicle type: Car           Distance: " + getDistanceTraveled() + "         Toll amount: $" + getToll()
                    + "\n"

                    ;
        }
    }

