import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        System.out.println(CouldCopyTextFromTo("MultiLines.txt", "Pokémon.txt"));
    }

    private static boolean CouldCopyTextFromTo(String start, String goal) {

        try {
            List<String> lines = Files.readAllLines(Paths.get(start));
            Files.write(Paths.get(goal), lines);
            return true;
        } catch (Exception e) {
            // Log it!
        }
        return false;
    }
}


