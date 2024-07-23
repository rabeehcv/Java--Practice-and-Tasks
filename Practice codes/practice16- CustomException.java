//custom exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class practice{
    //method that throws a custom exception
    public static  void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age should be more than 18.");
        }
        System.out.println("Age: " + age);
    }
    public static void main(String[] args){
        try{
            checkAge(17);
        }catch (InvalidAgeException e){
            System.out.println("Caught an InvalidAgeException: " + e.getMessage());
        }
    }
}
