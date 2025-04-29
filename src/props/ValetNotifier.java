package props;

public class ValetNotifier {

    public static void sendParkingAlert(Automobiles vehicle, ValetTicket ticket) {
        System.out.println("\n[ALERT]: Your " + vehicle.getBrand() + " has been parked.");
        System.out.println("Ticket Number: #" + ticket.getTicketNumber() + " | Parking Spot: " + ticket.getParkingSpot());
        System.out.println("Text 'READY' to the valet number when you are ready to leave.\n");
    }

    public static void sendRetrievalAlert(int ticketNumber) {
        System.out.println("\n[ALERT]: Valet is retrieving your vehicle.");
        System.out.println("ETA: Please wait approximately 5 minutes at the valet counter.\n");
    }
}
