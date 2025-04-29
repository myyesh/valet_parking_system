package props;

public class Cars extends Automobiles {

    public Cars(String brand, int year, float fuel) {
        super(brand, year, fuel);
    }

    @Override
    public void unlock() {
        System.out.println("The car is unlocked.");
    }

    @Override
    public void start() {
        System.out.println("The car was turned on via the ignition key.");
    }
}
