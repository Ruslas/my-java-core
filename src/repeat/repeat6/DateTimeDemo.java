package repeat.repeat6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1997, 8, 28);
        LocalDate now = LocalDate.now();
        String str = String.join(":", myBirthday.getYear()+"",
                myBirthday.getMonth()+"", myBirthday.getDayOfMonth()+"");

        System.out.println(str);
        System.out.println(myBirthday.isAfter(now));
        System.out.println(myBirthday.isBefore(now));
    }
}
