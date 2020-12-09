import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;

public class AppleTest {

  Apple apples;

  @Before
  public void setup() {
    apples = new Apple();
  }

  @org.junit.Test
  public void getApple_doGetApple() {
    String expected = "apple";
    String actual = apples.getApple();
    assertEquals(expected, actual);
  }



}