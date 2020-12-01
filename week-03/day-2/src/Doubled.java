import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        decrypter("Doubled.txt", "src/Decrypted.txt");

    }

    public static void decrypter(String filePath, String goalFile) {

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            String newLine;
            for (int i = 0; i < lines.size(); i++) {
                newLine = "";
                for (int j = 0; j < (lines.get(i).length() - 1); j++) {
                    char a = Character.toLowerCase(lines.get(i).charAt(j));
                    char b = Character.toLowerCase(lines.get(i).charAt(j + 1));
                    if (a != b) {
                        char c = lines.get(i).charAt(j);
                        newLine = newLine + c;
                    }
                    if (j == (lines.get(i).length() - 2)) {
                        newLine = newLine + lines.get(i).charAt(j + 1);
                    }
                }
                lines.remove(i);
                lines.add(i, newLine);
            }
            Files.write(Paths.get(goalFile), lines, StandardOpenOption.APPEND);
        } catch (Exception e) {
            //Log it
            System.err.println(e);
        }
    }
}
