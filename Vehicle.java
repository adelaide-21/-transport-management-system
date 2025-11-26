abstract class Vehicle {
    protected String licensePlate;
    protected String brand;
    protected int maxSpeed;

    public Vehicle(String licensePlate, String brand, int maxSpeed) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public abstract void displayInfo();

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
