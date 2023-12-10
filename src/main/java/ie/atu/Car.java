package ie.atu;

public class Car extends Vehicle{
    private String model;
    private int price;

    public Car() {
        this.model = "";
        this.price = 0;
    }

    public Car(String vehicle, String colour, int numWheels, String model, int price) {
        super(vehicle, colour, numWheels);
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " Car: " +
                ", model: '" + model + '\'' +
                ", price: " + price;
    }
}
