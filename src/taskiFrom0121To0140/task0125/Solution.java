/*В методе main вызывается метод add, который должен увеличить значение поля salary класса Solution
на переданное значение, но при выводе поля salary получаем 0. Сделай так, чтобы программа работала правильно.

Требования:
•	В классе Solution должно быть публичное статическое поле salary типа int.
•	В классе Solution должен быть публичный статический метод add(int) с типом возвращаемого значения void.
•	Исправь ошибку, чтобы программа работала корректно.*/

package taskiFrom0121To0140.task0125;

public class Solution {
    public static int salary;

    public static void add(int increase) {
        int salary1 = Solution.salary;
        salary += increase;
    }

    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
