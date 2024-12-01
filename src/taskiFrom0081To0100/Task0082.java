/*Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.

Требования:
•	Нужно, чтобы метод reverseString(String) использовал StringBuilder.
•	Нужно, чтобы метод reverseString(String) возвращал развернутую строку.*/

package taskiFrom0081To0100;

public class Task0082 {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
