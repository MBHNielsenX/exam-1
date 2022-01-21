public class Bus extends Vehicles {
    public Bus(String name, int velocity, int maxVelocity, int mileage) {
        super(name, velocity, maxVelocity, mileage);

    }

    public void accelerate () {
        int maxSpeed = 120;
        int currentSpeed = getVelocity();
        int addFiveKilometers = 5;

        if(currentSpeed < maxSpeed) {
            int newSpeed = currentSpeed + addFiveKilometers;
            setVelocity(newSpeed);
            System.out.println("\nThe speed of the bus went from " + currentSpeed + " to " + newSpeed);
        } else {
            System.out.println("\nYou have reached the max speed of 120 km/h");
        }
    }
}
