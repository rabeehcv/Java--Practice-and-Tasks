import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class practice{
    public static void main(String[] args){
        Path path = Paths.get("example.txt");
        String content = "Writing to file.\n Second line.";
        try{
            Files.write(path,content.getBytes(StandardCharsets.UTF_8));
        }catch (IOException e){
            System.err.println("Caught an IOException: " + e.getMessage());
        }
        try{
            List<String> list = Files.readAllLines(path);
            for(String line : list){
                System.out.println(line);
            }
        }catch(IOException e){
            System.err.println("Caught an IOException: " + e.getMessage());
        }
    }
}
