import java.io.IOException;

class practice{
    //method that throws a checked exception
    public static void readFile() throws IOException{
        throw new IOException("File not found");
    }
    public static void main(String[] args){
        try{
            //code that may throw an exception
            readFile();
        }catch (IOException e){
            //handle the exception
            System.out.println("Caught an ioException: " + e.getMessage());
        }finally{
            //code that will always execute whether an exception is throw or not
            System.out.println("Finally block is executed");
        }
        try{
            //throwing an unchecked exception
            int ans = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Caught an Arithmetic Exception: " + e.getMessage());
        }finally {
            System.out.println("finally block is executed");
        }
    }
}
