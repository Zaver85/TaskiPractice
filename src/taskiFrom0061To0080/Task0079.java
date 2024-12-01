/*Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.

Для этого используй метод String.format().

Требования:
•	Нужно, чтобы метод format(String, int) использовал метод String.format().
•	Нужно, чтобы метод format(String, int) возвращал строку согласно условию задачи.*/

package taskiFrom0061To0080;

public class Task0079 {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут . Я буду зарабатывать $ в месяц.";
        int index1 = phrase.indexOf(".");
        int index2 = phrase.indexOf("$");
        String str1 = phrase.substring(0, index1);
        String str2 = phrase.substring(index1, index2 + 1);
        String str3 = phrase.substring(index2 + 1);
        return String.format("%s%s%s%d%s", str1, name, str2, salary, str3);
    }
}
