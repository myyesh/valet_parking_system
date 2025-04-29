package props;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n--- Welcome to the Valet Parking System ---\n");

        // Create car and bike objects
        Cars car = new Cars("Toyota", 2023, 80.0f);
        Bikes bike = new Bikes("Harley", 2021, 40.0f);

        // Create ValetSystem instance
        ValetSystem valetSystem = new ValetSystem();

        // Park the vehicles and allot valet tickets
        ValetTicket carTicket = valetSystem.parkVehicle(car);
        ValetTicket bikeTicket = valetSystem.parkVehicle(bike);

        // Simulate retrieval process
        System.out.println("\n--- Retrieving Car ---");
        Automobiles retrievedCar = valetSystem.retrieveVehicle(carTicket.getTicketNumber());
        if (retrievedCar instanceof Cars) {
            Cars returnedCar = (Cars) retrievedCar;
            returnedCar.unlock();
            returnedCar.start();
            System.out.println("Brand: " + returnedCar.getBrand() + " | Year: " + returnedCar.getYear() + " | Fuel: " + returnedCar.getFuel() + "%");
        }

        System.out.println("\n--- Retrieving Bike ---");
        Automobiles retrievedBike = valetSystem.retrieveVehicle(bikeTicket.getTicketNumber());
        if (retrievedBike instanceof Bikes) {
            Bikes returnedBike = (Bikes) retrievedBike;
            returnedBike.unlock();
            returnedBike.start(); // Just call start() instead of kick()
            System.out.println("Brand: " + returnedBike.getBrand() + " | Year: " + returnedBike.getYear() + " | Fuel: " + returnedBike.getFuel() + "%");
        }

        // Create ValetBot instance and check vehicle status
        ValetBot valetBot = new ValetBot(valetSystem);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nValetBot :: Enter a ticket number to check vehicle status:");
        int ticketNumber = scanner.nextInt();
        valetBot.checkVehicleStatus(ticketNumber);

        scanner.close();
        System.out.println("\n--- Thank you for using Valet Services! ---");
    }
}
