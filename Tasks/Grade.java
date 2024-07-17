/*
Create a Java program that calculates the grade based on marks entered by the user.
 */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        char input = 'c';
        System.out.println("Hello Student!");
        while(input == 'c'){
        System.out.print("Please enter your marks out of 100: ");
        float marks = new Scanner(System.in).nextFloat();
        if(marks < 0 || marks > 100){
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
        }
        else{
            if(marks >= 90){
                System.out.println("Congratulations! You have secured Grade A.");
            }
            else if(marks>=80 && marks<90){
                System.out.println("Congratulations! You have secured Grade B.");
            }
            else if(marks>=70 && marks<80){
                System.out.println("Congratulations! You have secured Grade C.");
            }
            else if(marks>=60 && marks<70){
                System.out.println("Congratulations! You have secured Grade D.");
            }
            else{
                System.out.println("Unfortunately, you have failed.");
            }
        }
        System.out.print("Press c to continue OR any other alphabets or digits to exit: ");
        input = new Scanner(System.in).next().charAt(0);
    }
}}
