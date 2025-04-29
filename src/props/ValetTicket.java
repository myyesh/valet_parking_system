package props;

public class ValetTicket {
    private final int ticketNumber;
    private final int parkingSpot; // This will store the parking spot number

    public ValetTicket(int ticketNumber, int parkingSpot) {
        this.ticketNumber = ticketNumber;
        this.parkingSpot = parkingSpot;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    @Override
    public String toString() {
        return "Valet Ticket #" + ticketNumber + " (Spot " + parkingSpot + ")";
    }
}
