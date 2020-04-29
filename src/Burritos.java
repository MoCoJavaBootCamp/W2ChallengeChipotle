import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Burritos {
    public static void main(String[] args) {
        // declare string array variables for each category, including their string names
        Random random = new Random();
        String[] rice = {"none", "all", "white rice", "brown rice"};
        String[] meat = {"none", "all", "chicken", "steak", "carnitas", "chorizo", "sofritas", "veggie meat"};
        String[] beans = {"none", "all", "pinto beans", "black beans",};
        String[] salsa = { "none", "all", "mild salsa", "medium salsa", "hot salsa"};
        String[] veggies = { "none", "all", "lettuce", "fajita veggies"};
        String[][] basics = {rice, meat, beans, salsa, veggies};
        String[] basicStr = {"rice", "meat", "beans", "salsa", "veggies"};
        String[] toppings = {"cheese", "guac", "queso", "sour cream"};

        // loop 25x to make burritos
        for (int i = 0; i < 25; i += 1) {
            int numOfIngredients = 0;
            double cost = 3.00;
            String thisBurrito = "Burrito " + String.valueOf(i + 1) + ": ";

            // get random index for basics array (rice, meat, beans, salsa, veggies)
            // appropriately increment for ingredient count, cost
            // appropriately build string of burrito ingredients
            for (int k = 0; k < 5; k += 1) {
                int randomIdx = random.nextInt(basics[k].length);

                if (randomIdx == 0) {
                    thisBurrito += "no " + basicStr[k] + ", ";
                } else if (randomIdx == 1) {
                    thisBurrito += "all " + basicStr[k] + ", ";
                    cost += 0.50;
                } else {
                    thisBurrito += (basics[k][randomIdx]) + ", ";
                    cost += 0.50;
                }
                numOfIngredients += 1;
            }

            // get toppings using random boolean (cheese, guac, queso, sour cream)
            // appropriately increment for ingredient count, cost
            // appropriately build string of burrito ingredients
            for (int m = 0; m < toppings.length; m += 1) {
                boolean addTopping = random.nextBoolean();
                if (addTopping) {
                    thisBurrito += toppings[m] + ", ";
                    numOfIngredients += 1;
                    cost += 0.50;
                }
            }

            // remove trailing comma and space from end of string
            thisBurrito = thisBurrito.substring(0, thisBurrito.length() - 2);

            // print burrito number, ingredients and cost
            System.out.printf("%s \t\t$%.2f\n", thisBurrito, (cost));
        }
    }

}
