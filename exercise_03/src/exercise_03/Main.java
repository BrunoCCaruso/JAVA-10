///////////// exercise 03 ///////////////////

/*
Following the previous exercise, in the main we are going to create an ArrayList of
Appliances to store 4 appliances, either washing machines or
televisions, with values already assigned.
Then loop through this array and call the FinalPrice() method on each
appliance. The price of each type of object must also be shown,
that is, the price of all televisions and washing machines. Once done
Therefore, we must also show the sum of the price of all the
Home appliances. For example, if we have a washing machine with a price of 2000
and a TV of 5000, the final result will be 7000 (2000+5000) for
appliances, 2,000 for a washing machine and 5,000 for a television.
 */

package exercise_03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<HomeAppliances> productsList = new ArrayList<>();

        WashingMachine washingMachine = new WashingMachine(12000,"White","A",45,7);
        productsList.add(washingMachine);

        Tv tv = new Tv(30000,"Black","B",20,32,false);
        productsList.add(tv);

        WashingMachine washingMachine2 = new WashingMachine(40000,"Black","B",55,8);
        productsList.add(washingMachine2);

        Tv tv2 = new Tv(55000,"Gray","A",25,55,true);
        productsList.add(tv2);

        /////////////////////////////////////////////////////////////////////


        double washingMachinePrice = 0;
        double tvPrice = 0;
        double allPrice = 0;
        for (HomeAppliances product: productsList) {
            product.finalPrice();
            if(product instanceof WashingMachine){
                washingMachinePrice = washingMachinePrice + product.getPrice();
            }else if ( product instanceof Tv){
                tvPrice = tvPrice + product.getPrice();
            }
            allPrice = allPrice + product.getPrice();
        }

        System.out.printf("The total price of the TV is: $%.2f\n",tvPrice);
        System.out.printf("The total price of the washing machines is: $%.2f\n",washingMachinePrice);
        System.out.printf("The total price of the home appliances is: $%.2f",allPrice);



    }
}
