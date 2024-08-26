import java.util.Scanner;

public static void main(String[] args) {
    AirportManagement management = new AirportManagement();
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
        management.displayMenu();
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        switch (choice) {
            case 1:
                management.addAircraft();
                break;
            case 2:
                management.addCar();
                break;
            case 3:
                management.showAllAircrafts();
                break;
            case 4:
                management.showAllCars();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 5);
}