package props;

public abstract class Automobiles {

    private String brand;
    private int year;
    private float fuel;

    public Automobiles(String brand, int year, float fuel) {
        this.brand = brand;
        this.year = year;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public float getFuel() {
        return fuel;
    }

    public abstract void unlock();

    public abstract void start();
}
