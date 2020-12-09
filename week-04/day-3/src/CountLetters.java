import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public static void main(String[] args) {
    String tryWord = "assassin";
    CountLetters countLetters = new CountLetters();
    System.out.println(countLetters.countLetters(tryWord));
  }

  public HashMap<Character, Integer> countLetters(String input) {
    HashMap<Character, Integer> countingThem = new HashMap<>();
    for (int i = 0; i < input.length(); i++) {
      if (!countingThem.containsKey(input.charAt(i))) {
        countingThem.put(input.charAt(i), 1);
      } else {
        countingThem.put(input.charAt(i), countingThem.get(input.charAt(i)) + 1);
      }
    }
    return countingThem;
  }
}
