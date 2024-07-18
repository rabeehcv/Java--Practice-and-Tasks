/*
Write a Java program that demonstrates various OOP concepts including class design, inheritance, abstraction, polymorphism, encapsulation, method overriding, and method overloading.
 */
//interface for abstraction
interface VehicleInterface{
    void start();
    void stop();
}
//Superclass - Vehicle
class Vehicle{
    //fields
    String type;
    String model;
    int year;
    //encapsulated attribute
    private float price;
    //constructor
    public Vehicle(String type, String model, int year, float price){
        this.type = type;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    //Method
    public void displayinfo(){
        System.out.println("Vehicle type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    //Getter method to retrieve data
    public float getUpdatedPrice(){
        return price;
    }
    //Setter method to modify data
    public void setUpdatedPrice(int updatedPrice){
        this.price = updatedPrice;
    }
}
//subclass - Car, inherited from superclass vehicle implementing interface VehicleInterface
class Car extends Vehicle implements VehicleInterface{
    String color;
    public Car(String type, String model, int year, float price, String color){
        super(type, model, year, price);
        this.color = color;
    }
    //Method overriding
    @Override
    public void displayinfo(){
        System.out.println("Vehicle type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + getUpdatedPrice());
    }
    @Override
    public void start(){
        System.out.println("The "+ model+" engine Started");
    }
    @Override
    public void stop(){
        System.out.println("The "+model+" engine stopped");
    }
}
//subclass Motorcycle, inherited from superclass Vehicle implementing interface VehicleInterface
class MotorCycle extends Vehicle implements VehicleInterface{
    public MotorCycle(String type, String model, int year, float price){
        super(type, model, year, price);
    }
    @Override
    public void start(){
        System.out.println("The " + model + " engine started");
    }
    @Override
    public void stop(){
        System.out.println("The " + model + " engine stopped");
    }
}

public class oops {
    public static void main(String[] args) {
        //runtime polymorphism
        Vehicle vehicle = new Car("Car","Hyundai",2020,10000,"Black"); // Car object treated as Vehicle
        System.out.println("Before price is updated: ");
        vehicle.displayinfo();
        vehicle.setUpdatedPrice(15000);
        System.out.println("After price is updated: ");
        vehicle.displayinfo();
        display("Car",4);
        display("Black");

        //Creating an object motorcycle of the class Motorcycle that implements interface
        MotorCycle motorcycle = new MotorCycle("Motorcycle","BMW",2022,20000);
        //Use the motorcycle object to call the interface methods
        motorcycle.start();
        motorcycle.stop();

    }
    //Method overloading - compile time polymorphism
    public static void display(String VehicleType,int tyres){
        System.out.println(VehicleType + " will have " + tyres + " tyres.");
    }
    public static void display(String colour){
        System.out.println("Colour of the vehicle is " + colour);
    }
}
