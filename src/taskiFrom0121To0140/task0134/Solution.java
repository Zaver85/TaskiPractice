/*В классе taskiFrom0141To0160.task0141.Solution есть три поля с одинаковыми значениями. В методе main происходит их сравнение с выводом результата в консоли.
Добавь использование метода equals() в методе main такое минимальное количество раз, чтобы вывод был:
        true
        true
        true

Требования:
•	Поля класса taskiFrom0141To0160.task0141.Solution изменять нельзя.
•	Вывод должен соответствовать условию.
•	Добавь использование метода equals() минимальное количество раз.*/

package taskiFrom0121To0140.task0134;

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
