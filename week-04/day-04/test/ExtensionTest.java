import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by aze on 2017.04.04..
 */

public class ExtensionTest {

  Extension extension = new Extension();

  @Test
  public void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  public void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  public void testAdd_3and3is6() {
    assertEquals(6, extension.add(3, 3));
  }

  @Test
  public void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  public void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  public void testMaxOfThree_second() {
    assertEquals(5, extension.maxOfThree(3, 5, 4));
  }

  @Test
  //double - double -> delta
  public void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5)), 0);
  }

  @Test
  //double - double -> delta
  public void testMedian_five_unordered() {
    assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5, 5)), 0);
  }

  //double - double -> delta
  @Test
  public void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)), 0);
  }

  @Test
  public void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  public void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  public void testIsVowel_U() {
    assertTrue(extension.isVowel('U'));
  }

  @Test
  public void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  public void testTranslate_bemutatkozom() {
    assertEquals("bevemuvutavatkovozovom", extension.translate("bemutatkozom"));
  }

  @Test
  public void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  public void testTranslate_lAgopus() {
    assertEquals("lAvAgovopuvus", extension.translate("lAgopus"));
  }

  @Test
  public void testTranslate_mam() {
    assertEquals("mavam", extension.translate("mam"));
  }

  @Test
  public void testTranslate_a() {
    assertEquals("ava", extension.translate("a"));
  }
}

