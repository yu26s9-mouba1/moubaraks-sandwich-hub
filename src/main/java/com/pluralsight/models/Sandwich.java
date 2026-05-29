package com.pluralsight.models;

import java.util.ArrayList;

public class Sandwich extends Product {

    private int sandwichSize;
    private String bread;
    private boolean isToasted;
    private ArrayList<Topping> toppings;


    //Constructor
    public Sandwich(int sandwichSize, boolean isToasted, String bread) {
        this.sandwichSize = sandwichSize;
        this.isToasted = isToasted;
        this.bread = bread;
        this.toppings = new ArrayList<>();
    }


    //Getters and setters
    public int getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }


    /**
     * Adds a topping to the sandwich's topping list
     */
    public void addTopping(Topping topping) {
        toppings.add(topping);

    }


    /**
     * Calculates and return the cost of the items
     */
    @Override
    public double getPrice() {
        if (sandwichSize == 4) {
            return 5.50;
        } else if (sandwichSize == 8) {
            return 7.00;
        } else if (sandwichSize == 12) {
            return 8.50;
        }
        return 0;

    }

    /**
     * Generates receipt and returns a readable description of the items
     */
    @Override
    //Generates receipt
    public String getDetails() {
        String details = "";
        details += "    Sandwich:\n";
        details += "                                                                 Size: " + sandwichSize + "\n";
        details += "                                                                 Bread: " + bread + "\n";
        details += "                                                                 Toasted: " + isToasted + "\n";
        details += "                                                                 Toppings: \n";
        for (Topping topping : toppings) {
            details += "                                                               - " + topping.getName() + "\n";
        }
        details += "                                                                Price: $" + getPrice() + "\n";
        return details;
    }


}
