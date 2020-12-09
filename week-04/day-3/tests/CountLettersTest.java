import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class CountLettersTest {

  CountLetters countLetters;

  @Test
  public void countLetters_CheckMapSize() {
    countLetters = new CountLetters();
    HashMap<Character, Integer> tryMap = new HashMap<>();
    HashMap<Character, Integer> letsSeeMap = new HashMap<>();
    tryMap.put('b', 2);
    tryMap.put('a', 1);
    String line = "bab";
    letsSeeMap.putAll(countLetters.countLetters(line));
    assertTrue(tryMap.size() == letsSeeMap.size());
  }

  @Test(expected = NullPointerException.class)
  public void countLetters_CheckMapNull() {
    countLetters = new CountLetters();
    HashMap<Character, Integer> tryMap = new HashMap<>();
    HashMap<Character, Integer> letsSeeMap = new HashMap<>();
    tryMap.put('b', 2);
    tryMap.put('a', 1);
    String line = null;
    letsSeeMap.putAll(countLetters.countLetters(line));
    assertTrue(tryMap.size() == letsSeeMap.size());
  }

  @Test
  public void countLetters_CheckMapFull() {
    countLetters = new CountLetters();
    HashMap<Character, Integer> tryMap = new HashMap<>();
    HashMap<Character, Integer> letsSeeMap = new HashMap<>();
    tryMap.put('b', 2);
    tryMap.put('a', 1);
    String line = "bab";
    letsSeeMap.putAll(countLetters.countLetters(line));
    assertTrue(tryMap.equals(letsSeeMap));
  }


}