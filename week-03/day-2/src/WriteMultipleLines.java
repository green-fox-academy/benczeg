import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.
        AddLinesInText("MultiLines.txt", "Pokémon", 24);
    }

    private static void AddLinesInText(String path, String word, int number) {

        try {
            for (int i = 0; i < number; i++) {
                Files.write((Paths.get(path)), Collections.singleton(word), StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            // Log it!
        }
    }
}