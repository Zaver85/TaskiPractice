/*Исправь методы класса, используя класс Math:

sqrt(double) — должен возвращать квадратный корень переданного аргумента.
cbrt(double) — должен возвращать кубический корень переданного аргумента.
pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
        Требования:
        •	Реализуй метод sqrt(double) согласно условию.
        •	Реализуй метод cbrt(double) согласно условию.
        •	Реализуй метод pow(int, int) согласно условию.*/

package taskiFrom0041To0060;

public class Task0048 {
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number, power);
    }
}
