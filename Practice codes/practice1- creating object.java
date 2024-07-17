class Dog{
    //Fields(states)
    String name;
    String breed;
    int age;

    //Methods(Behavior)
    void bark(){
        System.out.println(age + " years old "+ name + " is barking and the breed of this dog is " + breed);
    }
}
public class practice {
    public static void main(String[] args) {
        //Creating an object
        Dog myDog = new Dog();
        myDog.name = "Bruno";
        myDog.breed = "German shepherd";
        myDog.age = 10;

        //Using an object
        myDog.bark();
    }
}
