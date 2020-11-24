import java.util.HashMap;
import java.util.Map;

public class MapIntroduction {
    public static void main(String[] args) {
        Map<Integer, Character> myMap = new HashMap<>();
        System.out.println(myMap.size());
        myMap.put(97, 'a');
        myMap.put(98, 'b');
        myMap.put(99, 'c');
        myMap.put(65, 'A');
        myMap.put(66, 'B');
        myMap.put(67, 'C');
        for (Integer key : myMap.keySet()) {
            System.out.println(key);
        }
        for (Character value : myMap.values()) {
            System.out.println(value);
        }
        myMap.put(68, 'D');
        System.out.println(myMap.size());
        for (Map.Entry<Integer, Character> keysAndValues : myMap.entrySet()
        ) {
            if (keysAndValues.getKey() == 99) {
                System.out.println(keysAndValues.getValue());
            }
        }
        myMap.remove(97);
        System.out.println(myMap.containsKey(100));
        myMap.clear();

    }
}


