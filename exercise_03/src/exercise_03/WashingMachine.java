package exercise_03;

public class WashingMachine extends HomeAppliances {
    private double capacity;

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


    @Override
    public void finalPrice() {
        super.finalPrice();
        if (capacity > 30) {
            price = price + 500;
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
