/*Нужно создать набор значений (enum) для времен года. Для этого нужно в отдельном файле создать enum Season
и объявить в нем 4 значения.
В методе Solution выведи все перечисления с новой строки.

Требования:
•	В отдельном файле создай публичный enum Season и добавь значения: WINTER, SPRING, SUMMER, AUTUMN.
•	В классе Solution выведи в консоли каждый сезон с новой строки. Используй перечисления напрямую: например, Season.WINTER.*/

package taskiFrom0161To0180.task0168;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
    }
}
