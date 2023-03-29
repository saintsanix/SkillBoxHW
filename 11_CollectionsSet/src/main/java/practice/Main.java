package practice;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static final EmailList EMAIL_LIST = new EmailList();
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            String[] components = input.split("\\s+", 2);
            if (components[0].equals("ADD")) {
                EMAIL_LIST.add(components[1]);
            } else if (components[0].equals("LIST")) {
                for (String e : EMAIL_LIST.getSortedEmails()) {
                    System.out.println(e);
                }
            } else {
                System.out.println("Wrong command");
            }
            
        }
    }
}
