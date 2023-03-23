package practice.regex;

public class SplitText {

  public static void main(String[] args) {
  }

  public static String splitTextIntoWords(String text) {
    String word = "";
    String[] words = text.split("[\\s.,;0-9-]+");
    for(int i = 0; i < words.length; i++) {
      word += words[i] + "\n";
    }
    return word.trim();
  }

}