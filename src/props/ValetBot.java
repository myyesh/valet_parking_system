package props;

import java.util.Map;
import java.util.Random;

public class ValetBot {

    private final ValetSystem valetSystem;
    private final Random random = new Random();

    public ValetBot(ValetSystem valetSystem) {
        this.valetSystem = valetSystem;
    }

    public void checkVehicleStatus(int ticketNumber) {
        Map<Integer, Automobiles> valetMap = valetSystem.getParkingMap();
        Automobiles vehicle = valetMap.get(ticketNumber);

        System.out.println("\n🤖 ValetBot Alert for Ticket #" + ticketNumber + ":");
        if (vehicle != null) {
            String valetName = generateRandomValetName();
            int eta = random.nextInt(3) + 2; // Random ETA between 2–4 minutes

            System.out.println("🚘 Your " + vehicle.getBrand() + " (" + vehicle.getYear() + ") is being retrieved.");
            System.out.println("👤 Valet " + valetName + " is bringing your vehicle.");
            System.out.println("⏳ ETA: Approximately " + eta + " minutes.");
            System.out.println("📍 Please stand by the valet counter. Thank you for your patience!");
        } else {
            System.out.println("⚠️ No vehicle currently parked with ticket #" + ticketNumber + ". Please verify your ticket.");
        }
    }

    private String generateRandomValetName() {
        String[] names = {"John", "Mike", "Sara", "Lily", "Alex", "David"};
        return names[random.nextInt(names.length)];
    }
}
