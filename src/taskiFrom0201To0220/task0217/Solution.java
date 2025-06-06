/*Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
Реализуй метод getDayOfWeek(Calendar calendar), чтобы он возвращал русское название дня недели аргумента calendar.
Помни, что в григорианском календаре неделя начинается с воскресенья.

Требования:
•	Переменная birthDate должна быть проинициализирована при объявлении.
•	Метод getDayOfWeek(Calendar calendar) должен возвращать день недели аргумента calendar.*/

package taskiFrom0201To0220.task0217;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Solution {

    static Calendar birthDate = new GregorianCalendar(2020, Calendar.MARCH, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result = "";
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                return "воскресенье";
            case 2:
                return "понедельник";
            case 3:
                return "вторник";
            case 4:
                return "среда";
            case 5:
                return "четверг";
            case 6:
                return "пятница";
            case 7:
                return "суббота";
        }
        return result;
    }
}
