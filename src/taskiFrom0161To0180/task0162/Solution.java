/*В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента,
а значение - его средняя оценка. Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их
средней оценкой в коллекцию grades.
Значения можешь выбрать любые.

Требования:
•	В классе Solution нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
•	В классе Solution должен быть публичный статический метод addStudents с типом возвращаемого значения void.
•	Метод addStudents должен добавлять 5 студентов со средней оценкой в поле grades.*/

package taskiFrom0161To0180.task0162;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Masha", 4.8);
        grades.put("Sasha", 4.7);
        grades.put("Dasha", 4.0);
        grades.put("Misha", 5.0);
        grades.put("Grisha", 3.8);
    }
}
