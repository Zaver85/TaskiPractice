/*Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
Для этого создай внутренний статический (вложенный) класс Calculator и
перенеси в него методы add, subtract, multiply и divide.
Не забудь подкорректировать их вызовы.

Требования:
•	В классе taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution нужно создать вложенный (static nested) класс Calculator.
•	Методы add, subtract, multiply и divide нужно перенести в класс Calculator.
•	В методе main должны быть вызваны методы add, subtract, multiply и divide класса Calculator.*/

package taskiFrom0101To0120.task0111;

public class Solution {
    public static final String EQUAL = " = ";

    static class Calculator {

        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }
}
