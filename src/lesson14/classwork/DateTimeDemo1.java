package lesson14.classwork;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeDemo1 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1997, 8, 27);
        System.out.println(birthday);
        int birthdayMont = birthday.getMonthValue();
        Month birthdayMontEn = birthday.getMonth();
        int birthdayYear = birthday.getYear();
        int birthdayDay = birthday.getDayOfMonth();
        System.out.printf("Мой день рождения:\t %s \t %s \t %s", birthdayYear, birthdayMont, birthdayDay);
        LocalDate today = LocalDate.now();
        System.out.println(birthday.isAfter(today));
        System.out.println(birthday.isBefore(today));
        System.out.println(today.isLeapYear());
    }
}
