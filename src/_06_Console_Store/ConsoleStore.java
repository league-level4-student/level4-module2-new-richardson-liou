package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.Cart;
import _02_Generics_Store.Candy;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Toy;
import _02_Generics_Store.Food;
import _02_Generics_Store.NonFood;


public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Cart<NonFood> noFoodCart = new Cart<>();
    	Cart<Food> foodCart = new Cart<>();
        double stipend = 50.0;

        Food candy = new Candy();
        Food cereal = new Cereal();
        NonFood clothing = new Clothing();
        NonFood toy = new Toy();

        double candyPrice = 5.0;
        double cerealPrice = 7.0;
        double clothingPrice = 15.0;
        double toyPrice = 10.0;

        do {
            System.out.println("Welcome to the store! Your stipend: $" + stipend);
            System.out.println("1. Candy - $" + candyPrice);
            System.out.println("2. Cereal - $" + cerealPrice);
            System.out.println("3. Clothing - $" + clothingPrice);
            System.out.println("4. Toy - $" + toyPrice);
            System.out.println("5. View Cart");
            System.out.println("6. Checkout");

            

        } while (true); 
    }

 
}
