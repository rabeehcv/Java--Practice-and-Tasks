import java.io.IOException;
import java.nio.file.Files; //imports the Files class from the java.nio.file package. This class provides various methods for working with files and paths.
import java.nio.file.Path;  // imports the Path interface, also from java.nio.file. It represents a path to a file or directory.
import java.nio.file.Paths; //imports the Paths class from java.nio.file. This class provides utility methods for creating Path objects.
import java.util.List;

class practice{
    public static void main(String[] args){
        Path path = Paths.get("example.txt");
        try{
            List<String> list = Files.readAllLines(path); //read all lines from the specified path and store them in a List of String objects. This method throws an IOException if any issues occur during reading.
            for(String line : list){
                System.out.println(line);
            }
        }catch (IOException e){
            System.err.println("Caught an IOException: " + e.getMessage());
        }
    }
}
