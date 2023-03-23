package practice.string;

import java.util.Scanner;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text) {

        int start = 0;
        int wordsCount = 1;

        StringBuilder result = new StringBuilder();
        while (start < text.length()) {
            int end = text.indexOf(' ', start);
            if (end < 0) {
                end = text.length();
            }
            String word = text.substring(start, end);
            start = end + 1;
            result.append(" (" + wordsCount + ") " + word);
            wordsCount += 1;
        }
        return result.toString().trim();
    }
}