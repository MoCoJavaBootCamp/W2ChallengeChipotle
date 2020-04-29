# Week 2 Challenge: Chipotle Burritos
## About
Chipotle Jr Plus+ is a robot that can produce a burrito with a set of random ingredients.<br>
Each burrito will have 5-9 ingredients, each costing $0.50, in the following categories:
* Rice
* Meat
* Beans
* Salsa
* Veggies<br><br>
And Toppings like:<br><br>
* Cheese
* Guac
* Queso
* Sour Cream

## Getting Started
* Clone repo
* Build project
* Run code

## Pseudocode

         1. declare string array variables for each category, including their string names
         2. loop 25x to make burritos 
             2.1 get random index for basics array (rice, meat, beans, salsa, veggies)
                 2.1.1 appropriately increment for ingredient count, cost
                 2.1.2 appropriately build string of burrito ingredients
             2.2 get toppings using random boolean (cheese, guac, queso, sour cream)
                2.2.1 appropriately increment for ingredient count, cost
                2.2.2 appropriately build string of burrito ingredients
             2.3 remove trailing comma and space from end of string
             2.4 print burrito number, ingredients and cost
             
