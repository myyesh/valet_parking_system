package props;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ValetSystem {
    private final AtomicInteger ticketCounter = new AtomicInteger(1000); // Start ticket from 1000
    private final HashMap<Integer, Automobiles> parkingMap = new HashMap<>();
    private final Random random = new Random();

    // Park a vehicle and issue a ticket
    public ValetTicket parkVehicle(Automobiles vehicle) {
        int ticketNum = ticketCounter.getAndIncrement();
        int parkingSpot = random.nextInt(50) + 1; // Random spot between 1 and 50

        parkingMap.put(ticketNum, vehicle);

        System.out.println("✅ Your ticket for " + vehicle.getBrand() +
                " has been created. It is parked at spot #" + parkingSpot +
                ". Text us when you are ready to leave. " + new ValetTicket(ticketNum, parkingSpot));

        return new ValetTicket(ticketNum, parkingSpot);
    }

    // Retrieve a vehicle based on the ticket number (do not remove from map)
    public Automobiles retrieveVehicle(int ticketNumber) {
        System.out.println("\n🚗 Retrieving vehicle with ticket: " + ticketNumber);
        return parkingMap.get(ticketNumber); // Return vehicle without removing it
    }

    // Get all parked vehicles (for ValetBot to access)
    public HashMap<Integer, Automobiles> getParkingMap() {
        return parkingMap;
    }

    // Inner class to store vehicle information and timestamp
    public static class ValetInfo {
        private final Automobiles vehicle;
        private final LocalDateTime timestamp;

        public ValetInfo(Automobiles vehicle, LocalDateTime timestamp) {
            this.vehicle = vehicle;
            this.timestamp = timestamp;
        }

        public Automobiles getVehicle() {
            return vehicle;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }
    }
}
