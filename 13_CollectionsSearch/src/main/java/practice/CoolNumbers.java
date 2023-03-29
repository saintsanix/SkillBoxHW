package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> coolNumber = new ArrayList<>();

    public static List<String> generateCoolNumbers() {
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (String letter1 : letters) {
            for (int i = 0; i <= 999; i += 111) {
                for (String letter2 : letters) {
                    for (String letter3 : letters) {
                        for (int j = 0; j <= 999; j++) {
                            coolNumber.add(String.format("%s%03d%s%s%02d", letter1, i, letter2, letter3, j));
                        }
                    }
                }
            }
        }
        Collections.sort(coolNumber);
        return coolNumber;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long time = System.nanoTime();
        if (coolNumber.contains(number)) {
            System.out.println("Поиск перебором: номер найден, поиск занял "
                    + (double) (System.nanoTime() - time) + " нс");
            return true;
        }
        System.out.println("Поиск перебором: номер не найден, поиск занял "
                + (double) (System.nanoTime() - time) + " нс");
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        long time = System.nanoTime();
        int index = Collections.binarySearch(coolNumber, number);
        if (index >= 0) {
            System.out.println("Бинарный поиск: номер найден, поиск занял "
                    + (double) (System.nanoTime() - time) + " нс");
            return true;
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял "
                    + (double) (System.nanoTime() - time) + " нс");
            return false;
        }
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        HashSet<String> arrNumber = new HashSet<>(coolNumber);
        long time = System.nanoTime();
        if (arrNumber.contains(number)) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял "
                    + (double) (System.nanoTime() - time) + " нс");
            return true;
        } else {
            System.out.println("Поиск в HashSet: номер не найден, поиск занял "
                    + (double) (System.nanoTime() - time) + " нс");
            return false;
        }
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        TreeSet<String> sortCoolNumber = new TreeSet<>(coolNumber);
        long time = System.nanoTime();
        if (sortCoolNumber.contains(number)) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял "
                    + (double) (System.nanoTime() - time) + " нс");
            return true;
        } else {
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял "
                    + (double) (System.nanoTime() - time) + " нс");
            return false;
        }
    }
}
