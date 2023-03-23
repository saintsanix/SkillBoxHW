package practice.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            String regex = "[^0-9]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String number = input.replaceAll(regex, "");
                if (number.length() > 11 || number.length() < 10) {
                    System.out.println("Неверный формат номера");
                    break;
                }
                if (number.charAt(0) == '8') {
                    String number2 = number.replaceFirst("8", "7");
                    System.out.println(number2);
                    break;
                }
                if (number.length() == 10) {
                    String number3 = number.replaceFirst("", "7");
                    System.out.println(number3);
                    break;
                }
                if (number.charAt(0) != '7') {
                    System.out.println("Неверный формат номера");
                } else {
                    System.out.println(number);
                }
            }
        }
    }
}