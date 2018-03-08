import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MagicWithNumbersTest {

  MagicWithNumbers sumNumber1;

  int[] testListMultipleElements = new int[]{1,2,3,4,5};

  @Before
  public void setUp() {
    sumNumber1 = new MagicWithNumbers();
  }

  @Test
  public void sum() {
    assertEquals(15, sumNumber1.Sum(testListMultipleElements));
  }
}
