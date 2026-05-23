package com.pluralsight.models;


public class Chips extends Product {

    private String chipType;


    //Constructor
    public Chips(String chipType) {
        this.chipType = chipType;
    }

    //Getter and setter
    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }


    //Override methods to get the appropriate chip calculations
    @Override
    //returns 1.50 for any type of chip
    public double getPrice() {
        return 1.50;

    }

    @Override
    public String getDetails() {
        return "chipType : " + chipType ;
    }


}
