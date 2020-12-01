import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        OrderReverser("ReversedOrder.txt", "NormalOrder.txt");

    }

    public static void OrderReverser(String filePath, String goalFile) {

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            List<String> newLine = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++) {
                newLine.add(lines.get((lines.size() - i - 1)));
                lines.remove(i);
                lines.add(i, newLine.get(i));
            }
            Files.write(Paths.get(goalFile), lines, StandardOpenOption.APPEND);
        } catch (Exception e) {
            //Log it
            System.err.println(e);
        }
    }
}
