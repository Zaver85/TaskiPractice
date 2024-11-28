/*Выведи на экран следующий текст в две строки:
It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"

Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).

Требования:
•	Нужно, чтобы программа выводила текст.
•	Нужно, чтобы было выведено две строки.
•	Текст первой строки должен быть: It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
•	Текст второй строки должен быть: It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
*/

package taskiFrom0061To0080;

public class Task0072 {
    public static void main(String[] args) {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
    }
}
