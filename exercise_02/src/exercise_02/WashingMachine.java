package exercise_02;

import java.util.Locale;
import java.util.Scanner;

public class WashingMachine extends HomeAppliances {
    private double capacity;
    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public WashingMachine() {
    }

    public WashingMachine(double price, String colour, String energyConsumption, double weight, double capacity) {
        super(price, colour, energyConsumption, weight);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void createWashingMachine() {
        super.createHomeAppliance();
        System.out.print("Enter the capacity of the washing machine: ");
        capacity = read.nextDouble();
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if(capacity >30){
            price = price +500;
        }
    }

    @Override
    public String toString() {
        return "Washing machine:\n" +
                "- Price = $" + price + "\n" +
                "- Colour = " + colour + "\n" +
                "- Energy consumption = " + energyConsumption + "\n" +
                "- Weight = " + weight + "kg\n" +
                "- Capacity = " + capacity + "kg\n";
    }
}
