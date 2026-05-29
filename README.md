# moubaraks-sandwich-hub
# Overview 
Deli-Cious Sandwich Shop is a Java console-based application that simulates the ordering process of a modern sandwich shop. Customers can build custom sandwiches, add drinks and chips, order signature sandwiches, review their order at checkout, and generate receipts that are automatically saved to a file.

This project demonstrates object-oriented programming principles such as inheritance, abstraction, encapsulation, and polymorphism while providing a realistic customer ordering experience.

## Features
## Home Screen
* Start a new order
* Exit the application
 <img width="934" height="148" alt="image" src="https://github.com/user-attachments/assets/c6c7e7ef-d745-4f04-8f5e-b47a29d0239e" />


## Order Screen
Customers can:
* Add a custum sandwich
* Add drinks
* Add chips
* Add signature sandwiches
* Checkout
* Cancel an order
 <img width="555" height="268" alt="image" src="https://github.com/user-attachments/assets/0025f012-0d1f-4b8c-96ca-beb87462615d" />


## Custom Sandwich Builder
# Customers can customize:
* Bread Options
* White
* Wheat
* Rye
* Wrap

# Sandwich Sizes
* 4"
* 8"
* 12"

# Meat Options
* Steak
* Ham
* Salami
* Roast Beef
* Chicken
* Bacon

# Cheese Options
* American
* Provolone
* Cheddar
* Swiss

# Regular Toppings
* Lettuce
* Peppers
* Onions
* Tomatoes
* Jalapeños
* Cucumbers
* Pickles
* Guacamole
* Mushrooms
* Sauces
* Mayo
* Mustard
* Ketchup
* Ranch
* Thousand Island
* Vinaigrette

# Additional Options
* Extra toppings
* Toasted sandwiches
  <img width="710" height="762" alt="image" src="https://github.com/user-attachments/assets/35bb434c-fc30-4fc7-a6dd-e0ffd1274f5b" />



## Drink Menu

# Available drink flavors include:

* Sodas
* Coke
* Sprite
* Pepsi
* Dr Pepper
* Fanta
* Ginger Ale
* Juices
* Apple Juice
* Orange Juice
* Cranberry Juice
* Tea & Lemonade
* Arizona
* Sweet Tea
* Lemonade
* Water & Sports Drinks
* Regular Water
* Sparkling Water
* Gatorade

# Drink sizes:

* Small
* Medium
* Large

## Customers can purchase multiple drinks in a single order.

# Chips Menu

Available chips include:
Potato Chips
Tortilla Chips
Corn Chips



## Signature Sandwiches
# BLT
Includes:
* Bacon
* Cheddar Cheese
* Lettuce
* Tomato
* Ranch
* Toasted
* White Bread (8")

## Philly Cheese Steak
# Includes:
* Steak
* American Cheese
* Peppers
* Mayo
* Toasted
* White Bread (8")
  <img width="593" height="137" alt="image" src="https://github.com/user-attachments/assets/e09f8f73-75fe-4924-896b-05338de5106d" />

  

## Checkout System
# Before confirming an order, customers can review:

All items added to the cart
Individual item details
Total order price

# Customers may then:
* Confirm the purchase
* Cancel the order
  <img width="755" height="717" alt="image" src="https://github.com/user-attachments/assets/d5cc87c1-bc2d-47e4-8d89-ec05e4637bb7" />
  

## Receipt Generation
Upon checkout:

A receipt is automatically generated
Receipts are stored inside the receipts directory
* Each receipt file contains:
* Order details
* Purchased items
* Total price
* Timestamped filename

Example:
2026-05-29-01-14-38.txt
<img width="354" height="455" alt="image" src="https://github.com/user-attachments/assets/3070731c-87d4-437c-81c4-1dd6e9c52d2e" />



## Object-Oriented Programming Concepts Used
* Abstraction

* Implemented using abstract Product class.

* Inheritance

* Classes extending Product:

* Sandwich
* Drink
* Chips

## Signature sandwich classes:

* BLT
* PhillyCheeseSteak
* Encapsulation

## Private fields with public getters and setters.

* Polymorphism

* Products stored and processed using Product references.

* Project Structure

src
├── MainApp.java
├── models
│ ├── Product.java
│ ├── Sandwich.java
│ ├── Drink.java
│ ├── Chips.java
│ ├── Topping.java
│ ├── BLT.java
│ ├── PhillyCheeseSteak.java
│ └── Order.java
├── ui
│ └── OrderScreen.java
├── services
│ └── ReceiptFileManager.java
└── receipts

## Updaded URL Diagram
<img width="1184" height="663" alt="image" src="https://github.com/user-attachments/assets/bccf10e8-70b6-45bc-acae-0b3068975945" />




## Reflection

This project strengthened my understanding of object-oriented programming, file handling, collections, user input validation, inheritance, abstraction, and real-world application design. Building a complete ordering system allowed me to apply classroom concepts to a practical software solution while improving my Java programming skills.

## Author

Moubarak Congacou
May 2026

  
  
