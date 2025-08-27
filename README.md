#  Java Food Vending Machine

A simple **console-based Food Vending Machine** program written in Java.  
The user can select food items from a menu, specify the quantity, view a **receipt summary**, and make payment with change calculation.

#  Features
- Displays a restaurant-style menu with prices.
- Lets the user order multiple items with custom quantities.
- Generates a **bill summary/receipt** with item-wise details.
- Calculates the total bill amount.
- Accepts payment and returns change (if any).
- Simple and beginner-friendly code (no ArrayList, only basic Java).

#  How It Works
1. The program displays a menu of food items.
2. User selects an item by entering a choice (1-6).
3. User enters the quantity.
4. The program adds the item to the bill and asks if the user wants to order more.
5. After finishing, a **bill summary** is shown.
6. User enters payment, and the program calculates change (if required).
7. Ends with a thank-you message.



## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/FoodVendingMachine.git

2. Navigate into the folder
   cd FoodVendingMachine

3.Compile the program
  javac FoodVendingMachine.java

4.Run the program
  java FoodVendingMachine



## Sample Output

=======Welcome to Java Food Vending Machine=======

1. Paneer Butter Masala - ₹200/-
2. Butter Chicken - ₹250/-
3. Butter Naan - ₹40/-
4. Butter Roti - ₹20/-
5. Fried Rice Veg - ₹180/-
6. Fried Rice Non-Veg(Chicken) - ₹220/-

Enter your choice(1-6): 2
Enter the Quantity: 2
Do you want to order more(y/n): y
...
======= BILL SUMMARY =======
Butter Chicken x 2 = ₹500
Butter Naan x 3 = ₹120
Total Bill: ₹620
============================
Enter Payment: 700
Your Change: 80
Thanks for Ordering, See you again!!
