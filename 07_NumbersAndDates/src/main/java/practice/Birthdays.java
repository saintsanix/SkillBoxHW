package practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 26;
        int month = 10;
        int year = 1995;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        int i = 0;
        String text = "";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEEE").
                localizedBy(new Locale("us"));
        int periodYears = Period.between(birthday, today).getYears();
        int periodMonths = Period.between(birthday, today).getMonths();
        int periodDays = Period.between(birthday, today).getDays();

        if (birthday.isEqual(today)) {
            text = text + 0 + " - " + formatter.format(today);
        } else if (periodYears > 0 || periodMonths > 0 || periodDays > 0) {
            for ( ; i <= periodYears; i++) {
                text = text + (i + " - " + formatter.format(birthday) + System.lineSeparator());
                birthday = birthday.plusYears(1);
            }
        }
        return text;
    }
}
