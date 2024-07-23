/*
Use a HashMap to map ISBN numbers to books for quick lookup.Implement functionalities to add, update, and retrieve book details using ISBN.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class newBook{
    String author;
    String title;
    float price;
    String isbn;
    public newBook(String title, String author, float price, String isbn){
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }
    public void setPrice(float updatedPrice){
        this.price = updatedPrice;
    }
    public void displayinfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price:$ " + price);
        System.out.println("ISBN: " + isbn);
    }
}
public class HashMapTask {
    static Map<String, newBook> ISBNmap = new HashMap<>();
    public static void main(String[] args) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while(!exit){
            System.out.println("Choose any of the following option: \n 1. Add a book.\n 2. Update price of the book. \n 3. Retrieve a book. \n 4. Exit.");
            System.out.print("Enter your option: ");
            int choice = scanner.nextInt();
            if(choice < 1 || choice > 4){
                System.out.println("Invalid input");
            }
            switch (choice){
                case 1:
                    scanner.nextLine();
                    System.out.print(" Title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Author of the book: ");
                    String author = scanner.nextLine();
                    System.out.print("Price: ");
                    String str = scanner.nextLine();
                    float price = Float.parseFloat(str);
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    newBook newbook = new newBook(title,author,price,isbn);
                    ISBNmap.put(isbn,newbook);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    scanner.nextLine();
                    if(ISBNmap.isEmpty()){
                        System.out.println("No books available.");
                        break;
                    }
                    System.out.print("Enter ISBN: ");
                    String newisbn = scanner.nextLine();
                    boolean isPresent = ISBNmap.containsKey(newisbn);
                    if(!isPresent){
                        System.out.println("Invalid ISBN");
                        break;
                    }
                    newBook updatedbook = ISBNmap.get(newisbn);
                    System.out.print("Enter updated price: ");
                    String updatedstr = scanner.nextLine();
                    float updatedprice = Float.parseFloat(updatedstr);
                    updatedbook.setPrice(updatedprice);
                    System.out.println("Price updated successfully.");
                    break;
                case 3:
                    scanner.nextLine();
                    if(ISBNmap.isEmpty()){
                        System.out.println("No books available.");
                        break;
                    }
                    System.out.println("ISBN of available books: " + ISBNmap.keySet());
                    System.out.print("Enter ISBN to retrieve a particular book: ");
                    String retrieveIsbn = scanner.nextLine();
                    boolean Present = ISBNmap.containsKey(retrieveIsbn);
                    if(!Present){
                        System.out.println("Invalid ISBN");
                        break;
                    }
                    newBook displaybook = ISBNmap.get(retrieveIsbn);
                    displaybook.displayinfo();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
}
