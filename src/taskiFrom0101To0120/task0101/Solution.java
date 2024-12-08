/*В классе taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution есть поле currentYear, которое должно инициализироваться значением
текущего года(Calendar.getInstance().get(Calendar.YEAR)) при создании нового объекта типа taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution.
Тебе нужно найти ошибку и исправить её, чтобы при создании объекта класса taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution
поле currentYear правильно инициализировалось.

Требования:
•	В классе taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution должно быть приватное не статическое поля currentYear типа int.
•	В классе taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution должен быть геттер getCurrentYear для поля currentYear.
•	При создании объекта класса taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution, currentYear должно инициализироваться значением
        текущего года (используй метод Calendar.getInstance().get(Calendar.YEAR)).*/

package taskiFrom0101To0120.task0101;

import java.util.Calendar;

public class Solution {

    private int currentYear;

    public Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
    }
}
