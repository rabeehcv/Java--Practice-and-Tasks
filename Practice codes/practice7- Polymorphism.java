// Example for polymorphism

//superclass
class Animal{
    //method
    public void makeSound(){
        System.out.println("Some sound");
    }
}
//subclass inherited from superclass Animal
class Dog extends Animal{
    //Method overriding used to specific implementation of Dog
    @Override
    public void makeSound(){
        System.out.println("Dog is barking");
    }
}
//class to demonstrate polymorphism
public class practice{
    public static void main(String[] args){
        //runtime polymorphism
        Animal animal = new Dog();
        animal.makeSound();

        //compile time polymorphism
        print(10);
        print("Hello World");
    }
    //Method overloading
    public static void print(int num){
        System.out.println("Integer: " + num);
    }
    public static void print(String str){
        System.out.println("String: " + str);
    }
}
