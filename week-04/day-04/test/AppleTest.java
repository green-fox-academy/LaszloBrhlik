import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  Apple apple;

  @Before
  public void setUp() {
    apple = new Apple("apple");
  }

  @Test
  public void getApple() {
    assertEquals("apple", apple.getApple());
  }
}
