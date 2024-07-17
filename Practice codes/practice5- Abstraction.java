
//Example for abstraction using interface

//interface representing a shape
interface Shape{
    //abstract method to calculate area
    double calculateArea();
}

//concrete class circle that implements shape
class Circle implements Shape{
    private double radius;

    //constructor to initialize Circle with radius
    public Circle(double radius){
        this.radius=radius;
    }

    //implementing abstract method to calculate area for circle
    @Override
    public double calculateArea(){
        return Math.PI *radius*radius;
    }
}

//class to demonstrate abstraction
public class practice {
    public static void main(String[] args) {
        //creating an instance of Circle
        Circle circle = new Circle(5);
        //Calculating and printing the area of the circle
        System.out.println("Area: " + circle.calculateArea());
    }
}
