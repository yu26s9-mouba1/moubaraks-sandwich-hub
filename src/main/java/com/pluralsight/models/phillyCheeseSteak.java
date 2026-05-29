package com.pluralsight.models;

public class phillyCheeseSteak extends Sandwich {


    //Constructor and super
    public phillyCheeseSteak() {
        super(8, true, "White");

        //New phillycheese steak topping objects
        Topping steak = new Topping("Steak", "Meat", false);
        addTopping(steak);

        Topping americanCheese = new Topping("American Cheese", "cheese", false);
        addTopping(americanCheese);

        Topping peppers = new Topping("Peppers", "regular", false);
        addTopping(peppers);

        Topping mayo = new Topping("Mayo", "sauce", false);
        addTopping(mayo);


    }

    @Override
    public String getDetails() {
        return "BLT Signature Sandwich: ";
    }



}
