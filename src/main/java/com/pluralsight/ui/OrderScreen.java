package com.pluralsight.ui;

import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;
import com.pluralsight.models.Topping;

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
            option = Console.promptForString("Enter your option: ");

            switch (option.toUpperCase()) {
                case "1":
                    Order order = new Order(); //Creates new order and pass it to the order screen (method)
                    displayOrderScreen(order);
                    break;
                case "0":
                    System.out.println("God Bye!");
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
            option = Console.promptForString("Enter your option: ");

            switch (option.toUpperCase()) {
                case "1":
                    addSandwich();
                    break;
                case "2":
                    addDrink();
                    break;
                case "3":
                    addChips();
                    break;
                case "4":
                    checkOut();
                    break;
                case "0":
                    cancelOrder();
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
    public void addSandwich() {
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

            breadChoice = Console.promptForString("Enter your option: ");
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
            choice = Console.promptForString("Enter your option: ");
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
                    Select Your Toppings:
                    1- Meats
                    2- Cheese
                    3- Other toppings
                    4- Select sauces
                
                 """;
            System.out.println(toppingsMenu);
            toppingChoice = Console.promptForString("Enter your option: ");
            switch (toppingChoice.toUpperCase()) {
                case "1": {
                    //Prompts user for meat options
                    String toppingName = Console.promptForString("Choose Meat: Steak, Ham, Salami, Roast beef, chicken, bacon").toUpperCase();
                    String toppingType = "Meats";
                    boolean isExtra = Console.promptForBool("Extra Meat?: true / false");

                    //Creates new meat topping
                    Topping meatTopping = new Topping(toppingName, toppingType, isExtra);
                    sandwich.addTopping(meatTopping);
                    break;
                }

                    case "2": {
                        //Prompts user for cheese options
                        String cheeseName = Console.promptForString("Chose Cheese: American, Provolone, Cheddar, Swiss").toUpperCase();
                        String cheeseType = "Cheese";
                        boolean isExtra = Console.promptForBool("Extra Cheese?: true / false");

                        //Creates new cheese topping
                        Topping cheeseTopping = new Topping(cheeseName, cheeseType, isExtra);
                        break;
                    }
                    case "3": {
                        //Prompt user for other toppings
                        String toppingName = Console.promptForString("Choose other toppings: lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms").toUpperCase();
                        String toppingType = "Regular Toppings";
                        boolean isExtra =  Console.promptForBool("Extra Topping?: true / false");

                        //Creates new topping object
                        Topping otherTopping = new Topping(toppingName, toppingType, isExtra);
                        break;
                    }
                    case "4": {
                        //Prompts user for sauce options
                        String sauceName = Console.promptForString("Select Sauce: mayo, mustard, ketchup, ranch, thousand islands, vinaigrette");
                        String sauceType = "Sauces";
                        boolean isExtra = Console.promptForBool("Extra Sauce?: true / false");

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
            toastedChoice = Console.promptForString("Enter Your Option: ");

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


        //Creates the toasted sandwich
        sandwich.setToasted(isToasted);

        //Stores the sandwich in the order
        order.addItem(sandwich);



    }


    /**
     *
     */
    public void addDrink() {

    }

    public void addChips() {

    }
    public void checkOut() {

    }

    public void cancelOrder() {

    }
}




