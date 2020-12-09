import java.util.ArrayList;
import java.util.List;

public class Anagram {

  public boolean areTheyAnagram(String one, String two) {
    List<Character> oneChars = new ArrayList<>();
    List<Character> twoChars = new ArrayList<>();
    for (int i = 0; i < one.length(); i++) {
      oneChars.add(one.charAt(i));
    }
    for (int i =  0; i < two.length(); i++) {
      twoChars.add(two.charAt(i));
    }
    oneChars.sort(Character::compareTo);
    twoChars.sort(Character::compareTo);
    return (one.equals(two));
  }
}
