package practice;

import java.util.*;

public class EmailList {
    TreeSet<String> emails = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        String regex = "\\w+@\\w+?\\.\\w{2,3}";
        if (!email.matches(regex)) {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
            System.out.println(email);
        } else {
            emails.add(email.toLowerCase());
            System.out.println("Добавлен email: " + email);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(emails);
    }

}
