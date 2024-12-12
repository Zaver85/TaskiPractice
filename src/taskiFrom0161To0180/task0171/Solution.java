/*В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц,
а если передан последний месяц, возвращать первый. Используй методы values и ordinal.
Метод main не участвует в проверке.

Требования:
•	Реализуй метод public static Month getNextMonth(Month): он должен работать согласно условию.
•	В методе getNextMonth должны использоваться методы ordinal() и values().*/

package taskiFrom0161To0180.task0171;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
        return Month.values()[ordinal];
    }
}
