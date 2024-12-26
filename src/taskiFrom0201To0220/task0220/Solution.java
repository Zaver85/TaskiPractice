/*В классе Solution реализуй 4 метода:

метод nowExample должен вернуть текущую дату;
остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.

Требования:
•	Метод nowExample должен вернуть текущую дату.
•	Метод ofExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.of.
•	Метод ofYearDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofYearDay.
•	Метод ofEpochDayExample должен вернуть дату 12 сентября 2020 года с помощью метода LocalDate.ofEpochDay.*/

package taskiFrom0201To0220.task0220;

import java.time.LocalDate;


public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate localDate = LocalDate.now();

        return localDate;
    }

    static LocalDate ofExample() {
        LocalDate localDate = LocalDate.of(2020, 9, 12);

        return localDate;
    }

    static LocalDate ofYearDayExample() {
        LocalDate localDate = LocalDate.ofYearDay(2020, 256);

        return localDate;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate localDate = LocalDate.ofEpochDay(18517);

        return localDate;
    }
}
