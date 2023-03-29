package practice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {

    private TreeMap<String, String> phoneBook = new TreeMap<>();
    public final String REGEX_NAME = "^[А-Я][а-я]*$";
     public final String REGEX_PHONE = "[7|8]\\d{10}";
    public final String WRONG_INPUT = "Неверный формат ввода";

    public boolean isPhone(String userInput) {
        return userInput.matches(REGEX_PHONE);
    }

    public boolean isName(String userInput) {
        return userInput.matches(REGEX_NAME);
    }


    public void addContact(String phone, String name) {
        if (isName(name) && isPhone(phone)) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                if (entry.getKey().contains(name) && entry.getValue().contains(phone)) {
                    System.out.println("Контакт с такими данными уже существует!");
                } else if (entry.getValue().contains(phone)) {
                    phoneBook.remove(entry.getKey());
                    break;
                } else if (entry.getKey().contains(name)) {
                    phoneBook.remove(entry.getKey());
                    phone = entry.getValue() + ", " + phone;
                }
            }
            phoneBook.put(name, phone);
            System.out.println("Добавлен контакт: " + name + " - " + phone);
        } else {
            System.out.println(WRONG_INPUT);
        }
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String result = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (phone.equals(value)) {
                result = key + " - " + value;
            }
        }
        System.out.println(result);
        return result;
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        String phoneStr = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals(name)) {
                phoneStr = key + " - " + value;
                treeSet.add(phoneStr);
            } else {
                System.out.println("Контакт \"" + name + "\" не найден");
            }
        }
        return treeSet;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> allContacts = new TreeSet<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
            if (!phoneBook.isEmpty()) {
                allContacts.add(key + " - " + value);
            }
        }
        return new TreeSet<>(allContacts);
    }


    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}