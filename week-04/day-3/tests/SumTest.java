import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

  Sum sum;

  @Before
  public void setup() {
    List<Integer> listTest = new ArrayList<>();
    sum = new Sum(listTest);

  }

  @Test
  public void makeSumTest_oneNumber() {
    List<Integer> listTestOne = new ArrayList<>();
    listTestOne.add(7);
    sum = new Sum(listTestOne);
    assertEquals(7, sum.makeSum());
  }

  @Test
  public void makeSumTest_addZero_addNegative() {
    List<Integer> listTest = new ArrayList<>();
    listTest.add(0);
    listTest.add(7);
    listTest.add(-12);
    listTest.add(24);
    listTest.add(-24);
    sum = new Sum(listTest);
    assertEquals(-5, sum.makeSum());
  }


  @Test
  public void makeSumTest_empty_list() {
    List<Integer> listTestEmpty = new ArrayList<>();
    sum = new Sum(listTestEmpty);
    assertEquals(0, sum.makeSum());
  }

  @Test(expected = NullPointerException.class)
  public void makeSumTest_null_list() {
    List<Integer> listTestNull = new ArrayList<>();
    listTestNull.add(null);
    sum = new Sum(listTestNull);
    int justDoSomeThing = sum.makeSum();
  }
}