
//Showing how to access and modify encapsulated data
class Car{
    //encapsulated attributes
    private String brand;
    private int year;
    private double price;

    //constructor
    public Car(String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    //Getter method to retrieve data
    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }

    public double getPrice(){
        return price;
    }

    //Setter method to modify data
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //method to display information
    public void displayinfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: $ " + price);
        System.out.println("Year: " + year);
    }
}
public class practice {
    public static void main(String[] args) {
        Car myCar = new Car("Hyundai", 2020, 1000000.00);
        myCar.displayinfo();
        myCar.setYear(2010);
        System.out.println("Updated Year: " + myCar.getYear());
    }
}
