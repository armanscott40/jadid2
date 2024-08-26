import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportManagement {
    private List<Aircraft> aircraftList;
    private List<Car> carList;

    public AirportManagement() {
        aircraftList = new ArrayList<>();
        carList = new ArrayList<>();
    }

    public void displayMenu() {
        System.out.println("Welcome to Airport Management System");
        System.out.println("1: Add Aircraft");
        System.out.println("2: Add Car");
        System.out.println("3: Show All Aircrafts");
        System.out.println("4: Show All Cars");
        System.out.println("5: Exit");
    }

    public void addAircraft() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Aircraft Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Registration Number: ");
        String registrationNumber = scanner.nextLine();
        Aircraft aircraft = new Aircraft(model, registrationNumber);
        aircraftList.add(aircraft);
        System.out.println("Aircraft added successfully!");
    }

    public void addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Car Make: ");
        String make = scanner.nextLine();
        System.out.print("Enter License Plate: ");
        String licensePlate = scanner.nextLine();
        Car car = new Car(make, licensePlate);
        carList.add(car);
        System.out.println("Car added successfully!");
    }

    public void showAllAircrafts() {
        System.out.println("All Aircrafts:");
        for (Aircraft aircraft : aircraftList) {
            System.out.println(aircraft);
        }
    }

    public void showAllCars() {
        System.out.println("All Cars:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }


}
