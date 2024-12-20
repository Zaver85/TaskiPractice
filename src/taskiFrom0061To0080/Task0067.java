/*В классе объявлены четыре публичных символьных поля.
Им присвоены некоторые значения. Но программа не компилируется.
Нужно это исправить, не меняя значения символов.
Все поля статические (static) — это нужно, чтобы в методе main() получить к ним доступ.
На результат можно посмотреть, запустив метод main(). Он не принимает участие в тестировании.

Требования:
•	Переменной first нужно присвоить значение '\u004A'.
•	Переменной second нужно присвоить значение 'a'.
•	Переменной third нужно присвоить значение '\u0076'.
•	Переменной fourth нужно присвоить значение 'a'.*/

package taskiFrom0061To0080;

public class Task0067 {
    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.print(first);
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
    }
}
