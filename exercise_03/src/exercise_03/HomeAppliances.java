package exercise_03;

public class HomeAppliances {
    protected double price;
    protected String colour;
    protected String energyConsumption;
    protected double weight;



    public HomeAppliances() {
    }

    public HomeAppliances(double price, String colour, String energyConsumption, double weight) {
        this.price = price;
        this.colour = colour;
        this.energyConsumption = energyConsumption;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(String energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void finalPrice() {
        switch (energyConsumption) {
            case "A":
                price = (price + 1000);
                break;
            case "B":
                price = (price + 800);
                break;
            case "C":
                price = (price + 600);
                break;
            case "D":
                price = (price + 500);
                break;
            case "E":
                price = (price + 300);
                break;
            case "F":
                price = (price + 100);
                break;
        }

        if (weight >= 1 && weight <= 19) {
            price = (price + 100);
        } else if (weight >= 20 && weight <= 49) {
            price = (price + 500);
        } else if (weight >= 50 && weight <= 79) {
            price = (price + 800);
        } else if (weight >= 80) {
            price = (price + 1000);
        }

    }
}
