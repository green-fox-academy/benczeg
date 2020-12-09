import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

/**
 * Created by aze on 2017.04.04..
 */
public class ExtensionTest {


  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
  }

  @Test
  void testIsVowel_a() {
    extension.isVowel('a');
  }

  @Test
  void testIsVowel_u() {
    extension.isVowel('u');
  }

  @Test
  void testTranslate_bemutatkozik() {
    String got = extension.translate("bemutatkozik");
    String expected = "bevemuvutavatkovozivik";
  //  assertEquals(got, expected);
  }

  @Test
  void testTranslate_lagopus() {
  //  assertTrue("lavagovopuvus", equals(extension.translate("lagopus")));
  }
}
