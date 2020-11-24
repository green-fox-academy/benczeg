import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        Map<String, String> isbn = new HashMap<>();
        isbn.put("978-1-60309-452-8", "A Letter to Jo");
        isbn.put("978-1-60309-459-7", "Lupus");
        isbn.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        isbn.put("978-1-60309-461-0", "The Lab");
        for (Map.Entry<String, String> pikachu : isbn.entrySet()
        ) {
            System.out.println(pikachu.getValue() + " (ISBN: " + pikachu.getKey() + ")");
        }
        isbn.remove("978-1-60309-444-3");
        for (Map.Entry<String, String> ratata : isbn.entrySet()
        ) {
            if (ratata.getValue().equals("The Lab")) {
                isbn.remove(ratata.getKey());
            }
        }
        isbn.put("978-1-60309-450-4", "They Called Us Enemy");
        isbn.put("978-1-60309-453-5", "hy Did We Trust Him?");
        isbn.containsKey("478-0-61159-424-8");
        System.out.println(isbn.get("978-1-60309-453-5"));
    }
}
