![image](https://github.com/user-attachments/assets/0616f7f2-1a1e-4312-bf01-eb5588d15186)### Class and Object

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

### Encapsulation: Protecting Your Data
- In object-oriented programming (OOP), encapsulation groups data and methods into a class while hiding implementation-specifics and exposing a public interface. It's like creating a protective shield around your data, allowing controlled access to it.
- Encapsulation hides the internal representation of an object from the outside world, preventing direct access to its data members.
- Encapsulation in Java includes limiting direct access by defining instance variables as private.
- There are defined public getters and setters for these variables. Getters retrieve data, while setters modify data.
- Data validation as well as consistent internal state management within the class are made possible by the use of getters, which obtain variable values, and setters, which make changes.
- Prevents accidental or malicious modifications to data.
- By using encapsulation, you create well-structured and maintainable code that protects your data and enhances code organization.

### Abstraction: Focusing on the Essential
- Abstraction is the process of simplifying complex systems by modeling classes based on their essential properties and behaviors, while hiding unnecessary details. It's like looking at a car: you know how to drive it, but you don't need to understand the intricacies of the engine to operate it.
- Abstraction in Java is achieved through interfaces and abstract classes.
- Data abstraction involves identifying only the essential characteristics of an object while ignoring irrelevant details.

Abstraction is achieved through:

- Abstract classes: Define a blueprint for subclasses but cannot be instantiated. It can have abstract and non abstract methods.
- Interfaces: Define a methods that classes must implement. Interfaces define what a class should do, without specifying how it's done. This promotes abstraction by hiding implementation details. Interface can have only abstract methods.
- Data hiding: Encapsulating data within classes and providing controlled access.

### Inheritance

- Creating new classes based on preexisting ones is what inheritance is all about.
- The attributes (fields) and behaviors (methods) of one class may be inherited by another class.
- A subclass or derived class derives from another class.
- The superclass or base class is the one from which the subclass inherits.
- The properties and methods of a superclass can be used by a subclass.
- In Java, inheritance encourages the reuse of existing code and the development of hierarchies of related classes.
- Subclass inherits attributes and behaviors from the superclass, and can add its own specific characteristics.

### Polymorphism
- It makes it possible to carry out a single activity in a variety of ways.
- Method overloading and method overriding are frequently used to achieve polymorphism.









