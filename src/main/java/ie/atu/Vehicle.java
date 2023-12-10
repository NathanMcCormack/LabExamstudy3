package ie.atu;

public class Vehicle {
    private String vehicle;
    private String colour;
    private int numWheels;

    public Vehicle() {
        this.vehicle = "";
        this.colour = "";
        this.numWheels = 0;
    }

    public Vehicle(String vehicle, String colour, int numWheels) {
        this.vehicle = vehicle;
        this.colour = colour;
        this.numWheels = numWheels;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                ", vehicle='" + vehicle + '\'' +
                ", colour='" + colour + '\'' +
                ", numWheels=" + numWheels;
    }
}
