package com.pluralsight.models;

public class Topping {

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


    //Calculates the price after toppings
//    public double getPrice() {
//        double price = 0;
//        if (type.equalsIgnoreCase("meat")) {
//            if (isExtra()){
//                price =
//
//            }










}
