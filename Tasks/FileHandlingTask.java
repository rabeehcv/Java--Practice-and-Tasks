/*
Use any one of the file handling to read employee records from a text file and write employee records to a text file
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandlingTask {
    public static void main(String[] args) {
        Path sourcepath = Paths.get("employee.txt");
        Path destinationpath = Paths.get("destination.txt");
        try{
            Files.write(destinationpath,Files.readAllLines(sourcepath));
        }catch(IOException e){
            System.err.println("Caught an IOException: File not found." );
        }
    }
}
