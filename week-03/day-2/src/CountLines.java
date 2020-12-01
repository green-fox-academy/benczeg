import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        System.out.println(NumberOfLines("my-file.txt"));
    }

    private static int NumberOfLines(String fileName) {
        try {
            String fileN = fileName;
            List<String> linesOfText = Files.readAllLines(Paths.get(fileN));
            return linesOfText.size();
        } catch (Exception e) {
            //log it
        }
        return 0;
    }
}
