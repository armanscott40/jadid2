public class Car {
    private String make;
    private String licensePlate;

    public Car(String make, String licensePlate) {
        this.make = make;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car Make: " + make + ", License Plate: " + licensePlate;
    }
}
