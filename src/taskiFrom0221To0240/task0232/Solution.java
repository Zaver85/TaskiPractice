/*В методе main выведи на экран переменную localDateTime в таком виде:
        19.03.2020г. 5ч.4мин

Требования:
•	Метод main должен вывести в консоли значение переменной localDateTime согласно шаблону.*/


package taskiFrom0221To0240.task0232;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Простой шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = dtf.format(localDateTime);
        System.out.println(text);
    }
}
