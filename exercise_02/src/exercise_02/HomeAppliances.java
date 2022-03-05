package exercise_02;

import java.util.Locale;
import java.util.Scanner;

public class HomeAppliances {
    protected double price;
    protected String colour;
    protected String energyConsumption;
    protected double weight;
    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);


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

    public void checkPowerConsumption(String letter) {

        switch (letter.toUpperCase()) {
            case "A":
                energyConsumption = "A";
                break;
            case "B":
                energyConsumption = "B";
                break;
            case "C":
                energyConsumption = "C";
                break;
            case "D":
                energyConsumption = "D";
                break;
            case "E":
                energyConsumption = "E";
                break;
            case "F":
                energyConsumption = "F";
                break;
            default:
                energyConsumption = "F";
        }

    }

    public void checkColour(String colour) {
        switch (colour.toLowerCase()) {
            case "white":
                this.colour = "white";
                break;
            case "black":
                this.colour = "black";
                break;
            case "red":
                this.colour = "red";
                break;
            case "blue":
                this.colour = "blue";
                break;
            case "grey":
                this.colour = "grey";
                break;
            default:
                this.colour = "white";
                break;
        }
    }


    public void createHomeAppliance() {
        System.out.println("What's the price of your home appliance?");
        price = 1000 + read.nextDouble();
        System.out.println("What's the colour of your home appliance?");
        colour = read.next();
        checkColour(colour);
        System.out.println("What's the energy consumption?");
        energyConsumption = read.next();
        checkPowerConsumption(energyConsumption);
        System.out.println("What's the weight of your home appliance?");
        weight = read.nextDouble();


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
