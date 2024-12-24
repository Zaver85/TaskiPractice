/*Цикл while должен был завершиться за 31 итерацию, но почему-то зациклился. Найди и исправь ошибку.

Требования:
•	Исправь одну ошибку, чтобы программа успешно завершилась.*/

package taskiFrom0201To0220.task0219;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Solution {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            start.add(Calendar.DATE, 1);
            System.out.print(".");
        }
        System.out.print("Финиш");
    }
}
