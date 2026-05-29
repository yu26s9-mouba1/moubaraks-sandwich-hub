package com.pluralsight.models;

public class BLT extends Sandwich {


    //Constructor and super
    public BLT() {
        super(8, true, "white");


        //New BLT Topping objects to be added to the toppings  menu
        Topping bacon = new Topping("Bacon", "Meat", false);
        addTopping(bacon);

        Topping cheddar = new Topping("Cheddar", "cheese", false);
        addTopping(cheddar);

        Topping lettuce = new Topping("Lettuce", "Regular", false);
        addTopping(lettuce);

        Topping tomato = new Topping("Tomato", "Regular", false);
        addTopping(tomato);

        Topping ranch = new Topping("Ranch", "Regular", false);
        addTopping(ranch);


    }

    @Override
    public String getDetails(){
        return "BLT Signature Sandwich: ";
    }
}
