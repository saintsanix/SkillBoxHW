import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;
        final int EXPECTED_COMPONENT_COUNT = 4;
        String phoneNumberRegex = "^\\+[7][9][\\d]{9}";
        String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        String[] components = data.split("\\s+");
        if (components.length != EXPECTED_COMPONENT_COUNT) {
            throw new IllegalArgumentException("Invalid number of components in data string");
        }
        if (!components[INDEX_PHONE].matches(phoneNumberRegex)) {
            throw new IllegalArgumentException("Invalid phone number format");
        }
        if (!components[INDEX_EMAIL].matches(emailRegex)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}