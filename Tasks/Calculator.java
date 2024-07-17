/*
Create a simple Java application that simulates a basic calculator. The calculator should be able
to perform addition, subtraction, multiplication, and division operations based on user input.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello!\nYou can choose any of the following operations by just providing the corresponding SI No.\nExample: You have to enter 1 for Addition.\n1. Addition \n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
        while(true){
            System.out.print("Choose an operation: ");
            int operations = new Scanner(System.in).nextInt();
            if(operations < 1 || operations > 5){
                System.out.println("Invalid SI No");

            }
            else{
            if(operations == 5){
                break;
            }
            if(operations == 1){
                System.out.print("Enter a number: ");
                float result = new Scanner(System.in).nextFloat();
                while(true){
                    System.out.print("Enter a number: ");
                    float number = new Scanner(System.in).nextFloat();
                    result += number;
                    System.out.print("Enter c to continue Or Enter r to get result: ");
                    char input = new Scanner(System.in).next().charAt(0);
                    if(input == 'r'){
                        break;
                    }
                }
                System.out.println("Result: " + result);
            }
            if(operations == 2){
                System.out.print("Enter a number: ");
                float result = new Scanner(System.in).nextFloat();
                while(true){
                    System.out.print("Enter a number: ");
                    float number = new Scanner(System.in).nextFloat();
                    result -= number;
                    System.out.print("Enter c to continue Or Enter r to get result: ");
                    char input = new Scanner(System.in).next().charAt(0);
                    if(input == 'r'){
                        break;
                    }
                }
                System.out.println("Result: " + result);
            }
            if(operations == 3){
                System.out.print("Enter a number: ");
                float result = new Scanner(System.in).nextFloat();
                while(true){
                    System.out.print("Enter a number: ");
                    float number = new Scanner(System.in).nextFloat();
                    result *= number;
                    System.out.print("Enter c to continue Or Enter r to get result: ");
                    char input = new Scanner(System.in).next().charAt(0);
                    if(input == 'r'){
                        break;
                    }
                }
                System.out.println("Result: " + result);
            }
            if(operations == 4){
                System.out.print("Enter a number: ");
                float result = new Scanner(System.in).nextFloat();
                while(true){
                    System.out.print("Enter a number: ");
                    float number = new Scanner(System.in).nextFloat();
                    result /= number;
                    System.out.print("Enter c to continue Or Enter r to get result: ");
                    char input = new Scanner(System.in).next().charAt(0);
                    if(input == 'r'){
                        break;
                    }
                }
                System.out.println("Result: " + result);
            }
        }
    }
}}
