////////// exercise 02 ///////////////////
/*
Create a superclass called Appliance with the following attributes:
price, color, energy consumption (letters between A and F) and weight.
The constructors that must be implemented are the following:
• An empty constructor.
• A constructor with all the attributes passed by parameter.
The methods to implement are:
• Getter and setter methods for all attributes.
• CheckPowerConsumption(String letter) method: checks that the letter
is correct, if not it is correct it will use the letter F by default. This method must be
invoke when creating the object and it will not be visible.
10
• method checkColour(String colour): checks that the color is correct, and
if it is not, it uses the default color white. The colors available for
appliances are white, black, red, blue and gray. It doesn't matter if the name
is in uppercase or lowercase. This method will be called when creating the
object and will not be visible.
• CreateHomeAppliance() method: asks the user for information and fills the
appliance, it also calls the methods to check the color and
consumption. The price is given a base value of $1000.
• finalPrice() method: depending on the energy consumption and its size, it will increase
the price value. This is the price list:

PRICE LETTER
A $1000
B $800
C $600
D $500
E $300
F $100
WEIGHT PRICE
Between 1 and 19 kg $100
Between 20 and 49 kg $500
Between 50 and 79 kg $800
Greater than 80 kg $1000

Next, create a subclass called Washer, with the attribute
load, in addition to the inherited attributes.
The constructors to be implemented will be:
• An empty constructor.
• A constructor with the load and the rest of the attributes inherited. Remember that
you must call the constructor of the parent class.
The methods to be implemented are:
• Get and set method of the load attribute.
• method createWashingMachine(): this method calls createHomeAppliance() of the
parent class, we use it to fill the attributes inherited from the parent, and
then we fill in the washing machine's own attribute.
• finalPrice() method: this method will be inherited and the following will be added
functionality. If you have a load greater than 30 kg, the price will increase by $500,
if the load is less than or equal, the price will not be increased. This method should
call the parent method and add the necessary code. Remember that the
conditions that we have seen in the Appliance class must also
affect the price.

You must also create a subclass called Television with the following
attributes: resolution (in inches) and DTT tuner (Boolean), in addition to the
inherited attributes.
The constructors to be implemented will be:
• An empty constructor.
• A constructor with the resolution, DTT tuner and the rest of the attributes
inherited. Remember that you must call the constructor of the parent class.
The methods to be implemented are:
• Get and set method of the DTT resolution and tuner attributes.
• method createTv(): this method calls createHomeAppliance() of the
parent class, we use it to fill the attributes inherited from the parent, and
then we fill in the attributes of the TV.
• finalPrice() method: this method will be inherited and the following will be added
functionality. If the TV has a resolution greater than 40 inches,
will increase the price by 30% and if it has a built-in DTT tuner,
will increase $500. Remember that the conditions we have seen in the class
Appliance should also affect the price.
Finally, in the main we must do the following:
Let's create a Washing Machine and a TV and call the necessary methods
to show the final price of the two appliances.

*/


package exercise_02;

public class Main {
    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();
        Tv tv = new Tv();

        washingMachine.createWashingMachine();
        washingMachine.finalPrice();
        System.out.println(washingMachine);

        tv.createTv();
        tv.finalPrice();
        System.out.println(tv);

    }
}
