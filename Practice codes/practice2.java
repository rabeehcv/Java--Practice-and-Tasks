class Dog{
    //Fields(states)
    String name;
    String breed;
    int age;

    //Constructor
    Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    //Methods (Behavior)
    void bark(){
        System.out.println(age + " years old "+ name + " is barking and the breed of this dog is " + breed );
    }
}
public class practice {
    public static void main(String[] args) {
        //Creating an object using the constructor
        Dog myDog = new Dog("Bruno", "German shepherd", 10 );
        //Using an object
        myDog.bark();
    }
}
