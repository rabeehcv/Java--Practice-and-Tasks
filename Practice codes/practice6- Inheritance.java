//Example for inheritance

//Superclass or Baseclass
class Animal{
    String name;
    int age;

    //Constructor for Animal class
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Methods of Animal class
    void eat(){
        System.out.println(name + " is eating");
    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }
}

//Subclass Dog inheriting from superclass Animal
class Dog extends Animal{

    //Constructor for Dog class
    public Dog(String name, int age){
        super(name, age);
    }

    //Specific method to Dog class
    void bark(){
        System.out.println(name + " is barking");
    }
}

//practice class to demonstrate inheritance
public class practice{
    public static void main(String[] args){
        //creating an object of Dog class
        Dog myDog = new Dog("Bruno", 2);

        //Accessing inherited method from Animal class
        myDog.eat();
        myDog.sleep();

        //calling specific method to Dog class
        myDog.bark();
        
    }
}
