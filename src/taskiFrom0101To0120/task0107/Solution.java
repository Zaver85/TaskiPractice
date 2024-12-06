/*В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
Затем округли полученное значение, используя статический метод round класса Math.
Результат выведи на экран.

Требования:
•	В методе main должен вызываться метод parseDouble класса Double.
•	В методе main должен вызываться метод round класса Math.
•	В консоли должно выводиться число 13.*/

package taskiFrom0101To0120.task0107;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";

        double d = Double.parseDouble(string);
        int a = (int) Math.round(d);
        System.out.println(a);
    }
}
