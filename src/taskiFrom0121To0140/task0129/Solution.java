/*Метод main класса Solution создает объект класса Student с конкретным именем,
но программа не компилируется.
Тебе нужно исправить ошибку в классе Student, чтобы программа компилировалась,
и при запуске в консоль выводилось имя студента.

Требования:
•	Метод main не изменяй.
•	В классе Student должен быть конструктор с одним параметром.
•	Конструктор должен инициализировать поле name полученным аргументом.*/

package taskiFrom0121To0140.task0129;

public class Solution {
    public static void main(String[] args) {
        Student student = new Student("Амиго");
        System.out.println(student.name);
    }
}
