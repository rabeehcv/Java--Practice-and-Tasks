/*
Write a Java program to parse a string into different primitive data types using wrapper class methods like parseInt, parseDouble, parseBoolean, etc., and convert primitive types to strings using valueOf
 */
public class WrapperTask {
    public static void main(String[] args) {
        //parsing a string to primitive data type
        int intValue = Integer.parseInt("100");
        double doubleValue = Double.parseDouble("99.9");
        boolean booleanValue = Boolean.parseBoolean("true");
        System.out.println("Parsed Integer: " + intValue);
        System.out.println("Parsed Double: " + doubleValue);
        System.out.println("Parsed Boolean: " + booleanValue);
        //converting primitive type to string
        int age = 12;
        String ageString = String.valueOf(age);
        System.out.println(ageString);
    }
}
