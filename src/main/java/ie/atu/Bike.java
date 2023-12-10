package ie.atu;

public class Bike extends Vehicle{
    private boolean electric;
    private int price;

    public Bike() {
        this.electric = false;
        this.price = 0;
    }

    public Bike(String vehicle, String colour, int numWheels, boolean electric, int price) {
        super(vehicle, colour, numWheels);
        this.electric = electric;
        this.price = price;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public int isPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " Bike: " +
                ", electric=" + electric +
                ", price=" + price;
    }
}
