package ie.atu;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("car", "black", 4, "BMW E30", 35000);
        Bike bike1 = new Bike();

        bike1.setElectric(true);
        bike1.setPrice(2000);
        bike1.setColour("Black");
        bike1.setVehicle("bike");
        bike1.setNumWheels(2);

        System.out.println(car1.toString());
        System.out.println(bike1.toString());
    }
}