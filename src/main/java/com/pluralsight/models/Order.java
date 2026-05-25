package com.pluralsight.models;
import  java.util.ArrayList;


public class Order {

    private ArrayList<Product> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds product into an order
     */
   public void addItem(Product item) {
      items.add(item);
   }

    /**
     * Calculates the entire and return the total price
     */
    public double getTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;

    }

    /**
     *Generates receipts with all the  details
     */
    public String getReceipt() {
        String details = "";
        for (Product item : items) {
           details += item.getDetails() + "\n";
        }
        details += "Total Price: " + getTotal() ;
        return details;

    }




}
