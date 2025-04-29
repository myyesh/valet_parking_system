package props;

public class Bikes extends Automobiles {

    public Bikes(String brand, int year, float fuel) {
        super(brand, year, fuel);
    }

    // Override unlock method for bikes
    @Override
    public void unlock() {
        System.out.println("The bike is unlocked.");
    }

    // Override start method for bikes
    @Override
    public void start() {
        System.out.println("The bike was turned on via the ignition key.");
    }
}
