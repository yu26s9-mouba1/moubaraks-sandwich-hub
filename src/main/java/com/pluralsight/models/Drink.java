package com.pluralsight.models;

public class Drink extends Product {

    private String drinkSize;
    private String flavor;

    //Constructor
    public Drink(String drinkSize, String flavor) {
        this.drinkSize = drinkSize;
        this.flavor = flavor;
    }

    //Getters and Setters
    public String getFlavor() {
        return flavor;
    }

    public void setFlavour(String flavor) {
        this.flavor = flavor;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    /**
     *  Override Methods to calculate the price of drinks
     */
    @Override
    //Calculates the drink price
    public double getPrice() {
        if (drinkSize.equalsIgnoreCase("small")){
            return 2.00;
        } else if (drinkSize.equalsIgnoreCase("medium")) {
            return 2.50;
        } else if (drinkSize.equalsIgnoreCase("large")) {
            return 3.00;
        }
        return 0;
    }

    @Override
    //Generates receipts details
    public String getDetails(){
        return "Drink: " + drinkSize + " " + flavor;

    }
}
