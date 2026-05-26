package com.pluralsight.services;
import com.pluralsight.models.Order;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class ReceiptFileManager {

    /**
     * Saves the customer receipt into a txt file
     * @param order the completed customer order
     */
    public void saveReceipt(Order order){

        //Handles exceptions
        try {
            //Creates receipt path
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd - HH:mm:ss");
            //generates timestamp filename
            String fileName = LocalDateTime.now().format(dtf) + ".txt";
            String filePath = "receipts/" + fileName;
             //Writes receipt text
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(order.getReceipt());

            bw.close();

        } catch (IOException ex) {
            System.out.println("Error saving receipt file " + ex.getMessage() );
        }

    }



}
