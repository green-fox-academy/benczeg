import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramTest {


  @Test
  public void areTheyAnagram_complete() {
    Anagram anagram = new Anagram();
    String one = "faxy0";
    String two = "xyfa0";
    anagram.areTheyAnagram(one,two);
  }
}