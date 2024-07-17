### Class and Object

In Java, a class is a template that defines the structure and behavior (data and methods) of objects. A class encapsulates data for the object and methods to manipulate that data. A class is defined only once and serves as a reference for creating multiple objects.

An object is an instance of a class. We can create many objects from a single class.

#### Structure of a Java Class

- Declaration: A class is declared using the class keyword followed by the class name.

- Fields (Variables): These are attributes or properties that store the state of the object.

- Methods: These are functions or procedures that define the behavior of the object. The main method is the entry point for a Java application. It's where program execution begins.

- Constructors: Special methods that are called when an object is instantiated. They initialize the object's state. Constructors don't have a return type, including void. A constructor method does have the same name as the class.

A constructor is optional but generally recommended for proper object initialization.
A main method is essential for executable applications but not required for all classes.

- The static keyword in Java is used for memory management primarily. It can be applied to variables, methods, blocks, and nested classes. Static members (variables or methods) belong to the class itself, not to individual objects. This means there's only one copy of the static member shared by all objects of that class, saving memory. Static final variables are often used to define constants that are shared across the entire program.

- The new keyword is used to create instances of classes, or objects.

How it works:

- Allocates memory: When you use new, memory is allocated in the heap for the new object.
- Calls the constructor: The constructor of the class is invoked to initialize the object's properties.
- Returns a reference: A reference to the newly created object is returned.

```
public class Car {
    // Fields
    private String color;
    private String model;
    private int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Year: " + year + ", Color: " + color);
    }
}
```

In the statement

```
this.color = color;
```

'this' is used to refer to the instance variable 'color' of the current object.

##### Explanation

color: This is the parameter passed to the constructor or method.

this.color: This refers to the instance variable color of the object on which the constructor or method is being invoked. The this keyword refers to the current object in a method or constructor.​
