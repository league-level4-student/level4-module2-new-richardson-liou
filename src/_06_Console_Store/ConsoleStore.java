package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.Cart;
import _02_Generics_Store.Candy;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Food;
import _02_Generics_Store.NonFood;
import _02_Generics_Store.Snickers;
import _02_Generics_Store.Toy;
import _02_Generics_Store.Twix;


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

    static Cart<Food> foodCart = new Cart<>();
    static double stipend = 35.0;

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);


        Food twix = new Twix();
        Food cheerios = new Cereal();
        Food snickers = new Snickers();
        Food luckyCharms = new Cereal();

        double twixPrice = 3.0;
        double cheeriosPrice = 7.0;
        double charmsPrice = 9.0;
        double snickersPrice = 3.5;
        System.out.println("Welcome to the store! Your stipend: $" + stipend);
        System.out.println("1. Snickers - $" + snickersPrice);
        System.out.println("2. Twix - $" + twixPrice);
        System.out.println("3. Cheerios - $" + cheeriosPrice);
        System.out.println("4. Lucky Charms - $" + charmsPrice);
        System.out.println("5. Remove items from cart" );
        System.out.println("6. View Cart");
        System.out.println("7. Checkout");

        do {
            

            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
            case 1:
                    foodCart.add(new Snickers());
                    stipend -= snickersPrice;
                    System.out.println("Stipend: " +stipend);
                break;
            case 2:

            		foodCart.add(new Twix());
            		stipend -= snickersPrice;
            		System.out.println("Stipend: " +stipend);
                break;
            case 3:
            		foodCart.add(new Cereal());
            		stipend -= cheeriosPrice;
            		System.out.println("Stipend: " +stipend);
                break;
            case 4:
            		foodCart.add(new Cereal());
            		stipend -= charmsPrice;
            		System.out.println("Stipend: " +stipend);
            	
                break;
            case 5:
            	System.out.println("What would you like to remove");
            	String item = scan.nextLine();
                foodCart.remove(item);
                if(item.equals("Snickers")) {
            		stipend += snickersPrice;
            	}
            	if(item.equals("Twix")) {
            		stipend += twixPrice;
            	}
            	if(item.equals("Cheerios")) {
            		stipend += cheeriosPrice;
            	}
            	if(item.equals("Lucky Charms")) {
            		stipend += charmsPrice;
            	}
            	System.out.println("Stipend: " + stipend);
                
                break;
            case 6:
            	foodCart.showCart();
                break;
                
            case 7:
            	System.out.println("7");

            		while(stipend< 0) {
                	System.out.println("You do not have enough money to purchase these items, what would you like to remove");
                	String extraItem = scan.nextLine();
                	
                	if(extraItem.equals("Snickers")) {
                		stipend += snickersPrice;
                	}
                	if(extraItem.equals("Twix")) {
                		stipend += twixPrice;
                	}
                	if(extraItem.equals("Cheerios")) {
                		stipend += cheeriosPrice;
                	}
                	if(extraItem.equals("Lucky Charms")) {
                		stipend += charmsPrice;
                	}
                	
                	foodCart.remove(extraItem);
                	System.out.println("Stipend: "+ stipend);
            		}
            		double cost = calculateTotalCost();
            		System.out.println("Your cost is: "+ cost);
            		foodCart.showCart();
                break;            
            default:
                System.out.println("Invalid choice. Try again.");
                break;
            }

        } while (true); 
        
    }


    
    private static double calculateTotalCost() {
    	
            double total = 35.0-stipend;
            
            return total;
        }
    

    
    
   
 
}
