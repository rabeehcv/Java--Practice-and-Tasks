/*
Implement a custom exception called ProductNotFoundException that is thrown when a product is not found in the inventory.Use try, catch, finally, throw, and throws to handle exceptions appropriately.
 */

import java.util.Scanner;
import java.util.TreeMap;

class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message){
        super(message);
    }
}

public class CustomExceptionTask {
    public static void displayProduct(String productName) throws ProductNotFoundException{
        if(!inventory.containsKey(productName)){
            throw new ProductNotFoundException("Product not found in inventory.");
        }
        System.out.println("Price of " + productName + ":$ " + inventory.get(productName));
    }
    private static TreeMap<String,Float> inventory = new TreeMap<>();
    public static void main(String[] args) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose any of the following option: ");
        while(!exit){
            System.out.println(" 1. Add products to inventory.\n 2. Display product in the inventory.\n 3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if(choice < 1 || choice > 3){
                System.out.println("Invalid choice");
            }
            switch(choice){
                case 1:
                    scanner.nextLine();
                    System.out.print("Add product to the inventory: ");
                    String product = scanner.nextLine();
                    System.out.print("Price of the product:$ ");
                    String priceString = scanner.nextLine();
                    float price = Float.parseFloat(priceString);
                    inventory.put(product,price);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    scanner.nextLine();
                    if(inventory.isEmpty()){
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    try{
                        displayProduct(productName);
                    }catch (ProductNotFoundException e){
                        System.out.println("Caught ProductNotFoundException: " + e.getMessage());
                    }finally{
                        System.out.println("Choose any of the following option: ");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
            }
        }
    }
}
