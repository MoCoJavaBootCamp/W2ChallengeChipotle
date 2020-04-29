import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Burritos {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<String, String> preparedBurritos = new HashMap<String, String>();
        String[] rice = {"none", "all", "white", "brown"};
        String[] meat = {"none", "all", "chicken", "steak", "carnitas", "chorizo", "sofritas", "veggie meat"};
        String[] beans = {"none", "all", "pinto beans", "black beans",};
        String[] salsa = { "none", "all", "mild", "medium", "hot"};
        String[] veggies = { "none", "all", "lettuce", "fajita veggies"};
        String[][] basics = {rice, meat, beans, salsa, veggies};
        String[] basicStr = {"rice", "meat", "beans", "salsa", "veggies"};
        String[] toppings = {"cheese", "guac", "queso", "sour cream"};

//        String cheese = "cheese";
//        String guac = "quac";
//        String queso = "queso";
//        String sourCream = "sour cream";
        int numOfIngredients = 0;
        String thisBurrito = "";

        // iterate 25x
            // get randomInt for rice, meat, beans, salsa veggies (4 iterations)
                // if randomInt is 0,
                    // string += "no [category]"
                // else if randomInt is 1
                    // thisBurrito += "all [category]"
                    // numOfIngredients += 1
                // else
                    // numOfIngredients += 1
                    // thisBurrito += "item"
            // finished burrito
                //put to HashMap
        // make 25 burritos
        for (int i = 0; i < 25; i += 1) {
            String iStr = String.valueOf(i + 1);
            // get random basics (rice, meat, beans, salsa, veggies)
            for (int k = 0; k < 5; k += 1) {
                int randomIdx = random.nextInt(basics[k].length);

                if (randomIdx == 0) {
                    thisBurrito += "no " + basicStr[k] + ", ";
                    break;
                }
                if (randomIdx == 1) {
                    thisBurrito += "all " + basicStr[k] + ", ";
                } else {
                    thisBurrito += (basics[k][randomIdx]) + ", ";
                }
                numOfIngredients += 1;
            }

            // get toppings (cheese, guac, queso, sour cream)
            for (int m = 0; m < toppings.length; m += 1) {
                boolean addTopping = random.nextBoolean();
                if (addTopping) {
                    thisBurrito += toppings[m] + ", ";
                    numOfIngredients += 1;
                }
            }
            preparedBurritos.put("Burrito " + iStr, thisBurrito);
        }

        System.out.println(preparedBurritos);
    }

//    public static String getRandomIngredient(String[] category, int ingredientCount) {
//        Random random = new Random();
//        int randomIdx = random.nextInt(category.length);
//        if (randomIdx == 1) {
//            ingredientCount += category.length - 2;
//        }
//        return
//    }
//
//    public static int countIngredients(int ingredientCount) {
//
//    }
//
//    public static double calcPrice(int ingredients) {
//        return (0.50 * ingredients) + 3;
//    }
}
