/*Реализуй метод getDayOfWeek(LocalDate date), чтобы он возвращал русское название дня недели аргумента date.
Воспользуйся методами getDayOfWeek и getDisplayName.

Пример параметров метода getDisplayName, чтобы получить русское название дня недели:

getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))

Требования:
•	Метод getDayOfWeek(LocalDate date) должен возвращать день недели на русском.
•	Чтобы получить название дня недели, нужно использовать методы getDayOfWeek и getDisplayName.*/

package taskiFrom0221To0240.task0221;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class Solution {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }
}
