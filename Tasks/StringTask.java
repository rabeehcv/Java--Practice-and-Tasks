/*
Write a Java program that performs the following operations on a given string: find its length, convert it to uppercase, extract a substring, and replace a character.
*/

public class StringTask{
    public static void main(String[] args) {
        String string = "Hello World";
        //Length of the string
        System.out.println("Length of the String is: " + string.length());
        //convert it to uppercase
        System.out.println("String content in Upper case: " + string.toUpperCase());
        //extract a substring
        System.out.println("Substring: " + string.substring(1,5));
        //Replace a character
        System.out.println("After replacing character: " + string.replace("World","Students"));
    }
}
