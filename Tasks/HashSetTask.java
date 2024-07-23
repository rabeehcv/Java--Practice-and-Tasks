/*
Use a HashSet to manage the unique genres available in the library.Ensure that new genres can be added without duplicating existing genres.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetTask {
    static Set<String> library = new HashSet<>();
    public static void main(String[] args) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while(!exit) {
            System.out.println("Choose any of the following option by entering corresponding SI No. :");
            System.out.println("1. Add a new genre.\n2. Display Available Genre.\n3. Exit.");
            System.out.print("Enter your option: ");
            int choice = scanner.nextInt();
            if(choice <1 || choice > 3){
                System.out.println("Invalid input.");
            }
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Add a new genre: ");
                    String genre = scanner.nextLine();
                    library.add(genre);
                    break;
                case 2:
                    if(library.isEmpty()){
                        System.out.println("No genres available.");
                        break;
                    }
                    System.out.println("Available Genres: " + library);
                    break;
                case 3:
                    exit = true;
                    break;
                }
            }
        }
    }

