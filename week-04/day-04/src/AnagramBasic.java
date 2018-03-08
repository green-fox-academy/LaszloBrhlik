public class AnagramBasic {

  private boolean result = true;

  public boolean isAnagram(String one, String two) {
    char[] charsOne = one.replaceAll("[\\s]", "")
            .toLowerCase().toCharArray();
    char[] charsTwo = two.replaceAll("[\\s]", "")
            .toLowerCase().toCharArray();

    if (charsOne.length != charsTwo.length) {
      result = false;
    }

    for (int i = 0; i < charsOne.length; i++) {
      for (int j = 0; j < charsTwo.length; j++) {
        if (charsOne[i] == charsTwo[j]) {
          charsOne[i] = '0';
          charsTwo[j] = '0';
        }
      }
    }

    for (int i = 0; i < charsOne.length; i++) {
      if (charsOne[i] != '0') {
        result = false;
      }
    }

    return result;
  }

/*  public static void main(String[] args) {
    AnagramBasic example = new AnagramBasic();
    System.out.println(example.isAnagram("aaaCcc", "ccc aaa"));
  }*/
}
