import java.util.Scanner;

public class Aircraft {
    private String model;
    private String registrationNumber;

    public Aircraft(String model, String registrationNumber) {
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Aircraft Model: " + model + ", Registration Number: " + registrationNumber;
    }
}
