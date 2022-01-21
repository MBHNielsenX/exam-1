public abstract class Vehicles {
    private String name;
    private int velocity;
    private int maxVelocity;
    private int mileage;

    public Vehicles(String name, int velocity, int maxVelocity, int mileage) {
        this.name = name;
        this.velocity = velocity;
        this.maxVelocity = maxVelocity;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public int getMileage() {
        return mileage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
