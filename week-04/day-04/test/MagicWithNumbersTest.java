import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MagicWithNumbersTest {

  MagicWithNumbers sumNumber1;

  int[] testListEmpty = new int[]{};
  int[] testListSingleElement = new int[]{10};
  int[] testListMultipleElements = new int[]{1,2,3,4,5};
  int[] testListNull = null;

  @Before
  public void setUp() {
    sumNumber1 = new MagicWithNumbers();
  }

  @Test
  public void sumEmptyElementsTest() {
    assertEquals(0, sumNumber1.Sum(testListEmpty));
  }

  @Test
  public void sumSingleElementTest() {
    assertEquals(10, sumNumber1.Sum(testListSingleElement));
  }

  @Test
  public void sumMultipleElementsTest() {
    assertEquals(15, sumNumber1.Sum(testListMultipleElements));
  }

  @Test(expected = NullPointerException.class)
  public void sumNullElementsTest() {
    assertEquals(0, sumNumber1.Sum(testListNull));
  }
}
