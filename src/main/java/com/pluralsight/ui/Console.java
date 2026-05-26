package com.pluralsight.ui;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Console {

    private static final Scanner scanner = new Scanner(System.in);


    /**
     * Prompts the user for a double.
     * @param prompt to display the user's input
     * @return the double the user selected.
     */
    public static double promptForDouble(String prompt) {

        System.out.print(prompt);
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;

    }


    /**
     * Prompts the user for a string.
     * @param prompt to display the user's input
     * @return the string the user selected.
     */
    public static String promptForString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }


    public static boolean promptForBool(String prompt) {

        String input = promptForString(prompt);

        return Boolean.parseBoolean(input);

    }


    /**
     * Prompts the user for a date
     * @param prompt to display the user's input
     * @return the string the user selected.
     */
    public static String promptForDate(String prompt) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        while (true) {
            try {

                String dateInput = promptForString(prompt);
                LocalDate parsedDate = LocalDate.parse(dateInput, fmt);
                return parsedDate.format(fmt);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid Date, please enter yyyy-MM-dd: ");

            }

        }


    }







}
