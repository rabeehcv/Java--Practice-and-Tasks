class Dog{
    String name;
    String breed;
    int age;

    void bark(){
        System.out.println(age + "years old"+ name + " is barking and ths dog is a " + breed + "breed");
    }
}
public class practice {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Bruno";
        myDog.breed = "German shepherd";
        myDog.age = 10;
        myDog.bark();
    }
}
