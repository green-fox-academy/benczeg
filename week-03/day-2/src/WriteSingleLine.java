import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Collections;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        AddNameInLine("Bencze Gábor");
    }

    private static void AddNameInLine(String name) {
        String nameGiven = name;
        try {
            Files.write((Paths.get("my-file.txt")), Collections.singleton(nameGiven));
        } catch (Exception e) {
            // Log it!
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}