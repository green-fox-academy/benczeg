import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        reverser("ReversedLines.txt", "StraightLines.txt");

    }

    public static void reverser(String filePath, String goalFile) {

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            String newLine;
            for (int i = 0; i < lines.size(); i++) {
                newLine = "";
                for (int j = 0; j < lines.get(i).length(); j++) {
                    char c = lines.get(i).charAt((lines.get(i).length() - j - 1));
                    newLine = newLine + c;
                }
                lines.remove(i);
                lines.add(i, newLine);
            }
            Files.write(Paths.get(goalFile), lines, StandardOpenOption.APPEND);
        } catch (Exception e) {
            //Log it
            //System.err.println(e);
        }
    }
}
