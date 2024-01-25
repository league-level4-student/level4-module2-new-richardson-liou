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
	Food twix = new Candy();
    Food cheerios = new Cereal();
    Food snickers = new Candy();
    Food luckyCharms = new Cereal();


    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	Cart<Food> foodCart = new Cart<>();
        double stipend = 50.0;

        Food twix = new Candy();
        Food cheerios = new Cereal();
        Food snickers = new Candy();
        Food luckyCharms = new Cereal();

        double twixPrice = 3.0;
        double cheeriosPrice = 7.0;
        double charmsPrice = 9.0;
        double snickersPrice = 3.5;


        do {
            System.out.println("Welcome to the store! Your stipend: $" + stipend);
            System.out.println("1. Snickers - $" + snickersPrice);
            System.out.println("2. Twix - $" + twixPrice);
            System.out.println("3. Cheerios - $" + cheeriosPrice);
            System.out.println("4. Lucky Charms - $" + charmsPrice);
            System.out.println("5. Remove items from cart" );
            System.out.println("6. View Cart");
            System.out.println("7. Checkout");

            int choice = scan.nextInt();
            switch (choice) {
            case 1:
                if (stipend >= snickersPrice) {
                    foodCart.add(new Candy());
                    stipend -= snickersPrice;
                } 
                break;
            case 2:
            	if (stipend >= twixPrice) {
            		foodCart.add(new Candy());
            		stipend -= snickersPrice;
            	}
            	
                break;
            case 3:
            	if (stipend >= cheeriosPrice) {
            		foodCart.add(new Cereal());
            		stipend -= cheeriosPrice;
            	}
            	
                break;
            case 4:
            	if (stipend >= charmsPrice) {
            		foodCart.add(new Cereal());
            		stipend -= charmsPrice;
            	}
            	
                break;
            case 5:
            	System.out.println("What would you like to remove");
            	String item = scan.nextLine();
                foodCart.remove(item);
            case 6:
            	foodCart.showCart();
                break;
                
            case 7:
            	if (stipend<0) {
                	System.out.println("You do not have enough money to purchase these items, what would you like to remove");
                	String extraItem = scan.nextLine();
                	
                	foodCart.remove(extraItem);
                
                }
                
            default:
                System.out.println("Invalid choice. Try again.");
                break;
            }

        } while (true); 
        
    }
    private static double getPrice(NonFood item) {
		return 0;
        // Implement logic to get the price of each item
        // You might need to modify this based on your actual implementation
        
    }

    
    private static double calculateTotalCost(Cart<Food> cart) {
    	
            double total = 0.0;
            
            return total;
        }
    

    
    
   
 
}
