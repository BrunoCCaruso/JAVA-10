package exercise_02;

import java.util.Locale;
import java.util.Scanner;

public class Tv extends HomeAppliances {
    private double resolution;
    private boolean freeviewTuner;
    private Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public Tv() {
    }

    public Tv(double price, String colour, String energyConsumption, double weight, double resolution, boolean freeviewTuner) {
        super(price, colour, energyConsumption, weight);
        this.resolution = resolution;
        this.freeviewTuner = freeviewTuner;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public boolean getFreeviewTuner() {
        return freeviewTuner;
    }

    public void setFreeviewTuner(boolean freeviewTuner) {
        this.freeviewTuner = freeviewTuner;
    }

    public void createTv() {
        super.createHomeAppliance();
        System.out.print("Enter the resolution (inches) of the Tv: ");
        resolution = read.nextDouble();
        System.out.println("Does the Tv have a freeview tuner?");
        String answer = read.next();
        if (answer.equalsIgnoreCase("yes")) {
            freeviewTuner = true;
        } else {
            freeviewTuner = false;
        }
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if (resolution > 40) {
            price = price + (price * 0.30);
        }
        if (freeviewTuner) {
            price = (price + 500);
        }
    }

    @Override
    public String toString() {
        return "Tv:\n" +
                "- Price = $" + price +"\n"+
                "- Colour = " + colour + "\n" +
                "- Energy consumption = " + energyConsumption + "\n" +
                "- Weight = " + weight + "kg\n"+
                "- Resolution = " + resolution + "''\n"+
                "- Freeview tuner = " + freeviewTuner+ "\n";
    }
}
