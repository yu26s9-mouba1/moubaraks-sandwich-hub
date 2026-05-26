package com.pluralsight.ui;
import com.pluralsight.models.Chips;

import com.pluralsight.models.Drink;
import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;
import com.pluralsight.models.Topping;
import com.pluralsight.services.ReceiptFileManager;

public class OrderScreen {

    private Order order;


    /**
     * Displays the home screen menu
     * Gives customers options to operate
     */
    public void displayHomeScreen() {
        String option;

        do {
            String homeMenu = """
                    Welcome To DELI-Cious!
                    1- New Order
                    0- Exit
                    """;
            System.out.println(homeMenu);
            option = Console.promptForString("Enter A Command: ");

            switch (option.toUpperCase()) {
                case "1":
                    Order order = new Order(); //Creates new order and pass it to the order screen (method)
                    displayOrderScreen(order);
                    break;
                case "0":
                    System.out.println("Good Bye, Thank you for Shopping at Deli-Cious!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (!option.equalsIgnoreCase("0")); //Runs till user enters 0

    }


    /**
     * Displays options for customers to begin shopping
     * Each option directs customer to multiple options to shop
     */
    public void displayOrderScreen(Order order) {
        String option;
        do {
            String orderMenu = """
                    Order Menu
                    1- Add Sandwich
                    2- Add Drink
                    3- Add Chips
                    4- Checkout
                    0- Cancel Order
            """;
            System.out.println(orderMenu);
            option = Console.promptForString("Enter A Command: ");

            switch (option.toUpperCase()) {
                case "1":
                    addSandwich(order);
                    break;
                case "2":
                    addDrink(order);
                    break;
                case "3":
                    addChips(order);
                    break;
                case "4":
                    checkOut(order);
                    break;
                case "0":
                    cancelOrder(order);
                    break;
                default:
                    System.out.println("Invalid option!");


            }
        } while (!option.equalsIgnoreCase("0"));

    }


    /**
     * Adds sandwich to customer shopping items
     * Makes customized sandwich with different toppings
     * Allows customer to add extra toppings, cheeze and sauce
     */
    public void addSandwich(Order order) {
        Sandwich sandwich;

        //Displays different type of breads for customer to make their sandwich
        String breadChoice;
        String breadType = "";
        do {
            String sandwichMenu = """
                    Select Your Bread:
                    1- White
                    2- Wheat
                    3- rye
                    4- wrap
           
            """;
            System.out.println(sandwichMenu);

            breadChoice = Console.promptForString("Enter A Command: ");
            switch (breadChoice.toUpperCase()) {
                case "1":
                    breadType =  "White";
                    break;
                case "2":
                    breadType = "Wheat";
                    break;
                case "3":
                    breadType = "Rye";
                    break;
                case "4":
                    breadType = "Wrap";
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }while (!breadChoice.equalsIgnoreCase("1")
                && !breadChoice.equalsIgnoreCase("2")
                && !breadChoice.equalsIgnoreCase("3")
                && !breadChoice.equalsIgnoreCase("4")
        );

             //Displays different sandwich sizes for customer to choose
           String choice;
           int sandwichSize = 0;
        do {
             String sandwichSizeMenu = """
                    Select Your Sandwich Size:
                    1 - Small
                    2 - Medium
                    3 - Large
                    """;
            System.out.println(sandwichSizeMenu);
            choice = Console.promptForString("Enter A Command: ");
            switch (choice.toUpperCase()) {
                case "1":
                    sandwichSize = 4;
                    break;
                case "2":
                        sandwichSize = 8;
                        break;
                case "3":
                    sandwichSize = 12;
                        break;
                default:
                    System.out.println("Invalid option!");

            }

        } while (!choice.equalsIgnoreCase("1")
                && !choice.equalsIgnoreCase("2")
                && !choice.equalsIgnoreCase("3"));

        //Creates new sandwich
        sandwich = new Sandwich(sandwichSize, false, breadType);




        //Adds toppings
        String toppingChoice;
        do {
            String toppingsMenu = """
                    Select Your Toppings
                    1- Meats
                    2- Cheese
                    3- Other toppings
                    4- Select sauces
                
                 """;
            System.out.println(toppingsMenu);
            toppingChoice = Console.promptForString("Enter A Command: ");
            switch (toppingChoice.toUpperCase()) {
                case "1": {
                    //Prompts user for meat options
                    String toppingName = Console.promptForString("Choose Meat: Steak, Ham, Salami, Roast beef, chicken, bacon").toUpperCase();
                    String toppingType = "Meats";
                    boolean isExtra = Console.promptForBool("Extra Meat? (yes/no): ");

                    //Creates new meat topping
                    Topping meatTopping = new Topping(toppingName, toppingType, isExtra);
                    sandwich.addTopping(meatTopping);
                    break;
                }

                    case "2": {
                        //Prompts user for cheese options
                        String cheeseName = Console.promptForString("Choose Cheese: American, Provolone, Cheddar, Swiss").toUpperCase();
                        String cheeseType = "Cheese";
                        boolean isExtra = Console.promptForBool("Extra Cheese? (yes/no): ");

                        //Creates new cheese topping
                        Topping cheeseTopping = new Topping(cheeseName, cheeseType, isExtra);
                        break;
                    }
                    case "3": {
                        //Prompt user for other toppings
                        String toppingName = Console.promptForString("Choose Other Toppings: lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms").toUpperCase();
                        String toppingType = "Regular Toppings";
                        boolean isExtra =
                                Console.promptForBool("Extra Topping? (yes/no): ");

                        //Creates new topping object
                        Topping otherTopping = new Topping(toppingName, toppingType, isExtra);
                        break;
                    }
                    case "4": {
                        //Prompts user for sauce options
                        String sauceName = Console.promptForString("Select Sauce: mayo, mustard, ketchup, ranch, thousand islands, vinaigrette").toUpperCase();
                        String sauceType = "Sauces";
                        boolean isExtra = Console.promptForBool("Extra Sauce? (yes/no): ");

                        //Create the sauce topping
                        Topping sauceTopping = new Topping(sauceName, sauceType, isExtra );
                        break;
                    }



            }
        } while (!toppingChoice.equalsIgnoreCase("1")
                && !toppingChoice.equalsIgnoreCase("2")
                && !toppingChoice.equalsIgnoreCase("3")
                && !toppingChoice.equalsIgnoreCase("4")
        );


        //Adds toasting
        String toastedChoice;
        boolean isToasted = false;

        do {
            String toastingMenu = """
                Would You Like The Sandwich Toasted?
                1- Yes
                2- No
                
                """;
            System.out.println(toastingMenu);
            toastedChoice = Console.promptForString("Enter A Command: ");

            switch (toastedChoice.toUpperCase()) {

                case "1": {
                    isToasted = true;
                    break;
                }
                case "2": {
                    isToasted = false;
                    break;
                }
                default: System.out.println("Invalid Choice!");
                break;

            }

        }  while (!toastedChoice.equalsIgnoreCase("1")
                && !toppingChoice.equalsIgnoreCase("2"));


        //Creates the new toasted sandwich object
        sandwich.setToasted(isToasted);

        //Stores the sandwich object in the order
        order.addItem(sandwich);
        System.out.println("Sandwich successfully added!");
    }


    /**
     * Displays different drink/size/flavor options for customer
     * Creates a new drink object
     * Stores the new drink into the order
     */
    public void addDrink(Order order) {
        Drink drink;

        // Drink Size Options
        String drinkChoice;
        String drinkSize = "";

        do {
            String drinkMenu = """
                Drink Size Menu:
                1- small
                2- Medium
                3- Large
            """;
            System.out.println(drinkMenu);

            drinkChoice = Console.promptForString("Enter Drink Size: ");

            switch (drinkChoice.toUpperCase()) {
                case "1": {
                    drinkSize = "small";
                    break;
                }
                case "2": {
                    drinkSize = "medium";
                    break;
                }
                case "3": {
                    drinkSize = "large";
                    break;
                }
                default:
                    System.out.println("Invalid Drink Size!");
                    break;

            }

        }while (!drinkChoice.equalsIgnoreCase("1")
                && !drinkChoice.equalsIgnoreCase("2")
                && !drinkChoice.equalsIgnoreCase("3"));


        //Drink Flavor Options
        String choice;
        String drinkFlavor = "";
        do {
            String drinkFlavorMenu = """
                Flavors Menu:
                1- Coke
                2- Sprite
                3- Pepsi
                4- Lemonade
                5- Arizona
            """;
            System.out.println(drinkFlavorMenu);
            choice = Console.promptForString("Enter Drink Flavor: ");

            switch (choice.toUpperCase()) {
                case "1":
                    drinkFlavor = "Coke";
                    break;

                case "2":
                    drinkFlavor = "Sprite";
                    break;

                case "3":
                    drinkFlavor = "Pepsi";
                    break;

                case "4":
                    drinkFlavor = "Lemonade";
                    break;

                case "5": {
                    drinkFlavor = "Arizona";
                    break;
                }
                default:
                    System.out.println("Invalid Drink Flavor!");
                }
            } while (!choice.equalsIgnoreCase("1")
        && !choice.equalsIgnoreCase("2")
        && !choice.equalsIgnoreCase("3")
        && !choice.equalsIgnoreCase("4")
        && !choice.equalsIgnoreCase("5"));

        //Creates the new drink object
         drink = new Drink(drinkSize, drinkFlavor);

        //Stores drink to the order
        order.addItem(drink);
        System.out.println("Drink successfully added!");

    }

    /**
     * Displays different types of chips
     * Creates new chip object and stores it into order
     */
    public void addChips(Order order) {
        Chips chips;

        //Chip Type Options
        String choice;
        String chipType = "";
        do {
            String chipMenu = """
                Chips Menu
                1- Potato Chips
                2- Tortilla Chips
                3- Corn Chips
            
            """;
            System.out.println(chipMenu);
            choice = Console.promptForString("Enter Chip Type: ").toUpperCase();
            switch (choice.toUpperCase()) {
                case "1":
                    chipType = "Potato Chips";
                    break;

                case "2":
                    chipType = "Tortilla Chips";
                    break;

                case "3":
                    chipType = "Corn Chips";
                    break;

                default:
                    System.out.println("Invalid Chip Type!");
                    break;


            }

        } while (!choice.equalsIgnoreCase("1")
                && !choice.equalsIgnoreCase("2")
                && !choice.equalsIgnoreCase("3"));

        //Creates the new chip object
        chips = new Chips(chipType);

        //Stores the new chip object into order
        order.addItem(chips);
        System.out.println("Chips successfully added!");



    }

    /**
     * Generates receipt details
     * Monitors user decision either to proceed with or cancel the order
     * Creates new receipt object and save it
     */
    public void checkOut(Order order) {
        //Gets order summary
        System.out.println(order.getReceipt());

        String choice = "";
        do {
            String checkoutMenu = """
                Checkout Menu:
                1- Confirm
                0- Cancel
            """;
            System.out.println(checkoutMenu);
            choice = Console.promptForString("Do you want to proceed?: ");

            switch (choice.toUpperCase()) {
                case "1":
                    //Calculates the total price of the order if customer chooses to continue
                    double total = order.getTotal();
                    System.out.println("Total: $" + total);

                    //Creates a new receipt object and Saves it
                    ReceiptFileManager receiptFileManager = new ReceiptFileManager();
                    receiptFileManager.saveReceipt(order);
                    System.out.println("Order Successfully Proceeded!");
                    break;

                    case "0":
                        //Cancels order and returns to the main menu
                       cancelOrder(order);
                        return;
                default:
                    System.out.println("Invalid Checkout!");
            }
        } while (!choice.equalsIgnoreCase("1") && !choice.equalsIgnoreCase("0"));






    }

    /**
     * Cancels and clears the order
     */
    public  void cancelOrder(Order order) {
        order.getItems().clear();
        System.out.println("Order has been cancelled!");
    }


}




