/*
Use an ArrayList to store the list of books. Each book should have attributes such as title, author, ISBN, and price.Implement functionalities to add new books, remove existing books, and display all books in the library.
 */
import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String author;
    String title;
    float price;
    String isbn;
    public Book(String title, String author, float price, String isbn){
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }
}

public class BookTask {
    private static ArrayList<Book> bookLibrary = new ArrayList<>();
    public static void addBook(Book book){
        bookLibrary.add(book);
    }
    public static void main(String[] args) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("Choose any of the following option: \n 1. Add a new book.\n 2. Remove a book.\n 3. Display all books in the library.\n 4. Exit.");
            System.out.print("Enter your option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Author of the book: ");
                    String author = scanner.nextLine();
                    System.out.print("Price of the book: ");
                    String pricestr = scanner.nextLine();
                    float price = Float.parseFloat(pricestr);
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newbook = new Book(title, author, price, isbn);
                    addBook(newbook);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    if(bookLibrary.isEmpty()){
                        System.out.println("There are no books to remove.");
                        break;
                    }
                    System.out.println("Available Books: ");
                    for(int i=0; i<bookLibrary.size(); i++){
                        System.out.println(i+1 + ". " + bookLibrary.get(i).title);
                    }
                    System.out.print("Enter corresponding SI NO of the book to be removed from the library: ");
                    int no = scanner.nextInt();
                    if(no < 1 || no > bookLibrary.size()){
                        System.out.println("Invalid Entry.");
                        break;
                    }
                    bookLibrary.remove(no-1);
                    System.out.println("Book removed successfully.");
                    break;
                case 3:
                    if(bookLibrary.isEmpty()){
                        System.out.println("There are no books to remove.");
                        break;
                    }
                    System.out.println("Available Books: ");
                    for(int i=0; i<bookLibrary.size(); i++){
                        System.out.println(i+1 + ". " + bookLibrary.get(i).title + " by " + bookLibrary.get(i).author + " - $ " + bookLibrary.get(i).price);
                    }
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
}
