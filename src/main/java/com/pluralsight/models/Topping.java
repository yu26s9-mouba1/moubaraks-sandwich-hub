package com.pluralsight.models;

public class Topping extends Product{

    private String name;
    private String type;
    private boolean isExtra;

    //Constructors
    public Topping(String name, String type, boolean isExtra) {
        this.name = name;
        this.type = type;
        this.isExtra = isExtra;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean isExtra) {
        this.isExtra = isExtra;
    }



    @Override
    public double getPrice(){
        return 0;  //No extra money for toppings
    }
    //Generates toppings details on the receipt
    @Override
    public String getDetails(){
        return
                name  + " (" + type + ")" + (isExtra ? " (Extra)" : "");
}









}
