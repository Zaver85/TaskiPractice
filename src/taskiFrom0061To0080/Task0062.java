/*Внеси исправления в метод main(), чтобы он выводил в консоли число 12.

Требования:
        •	В методе main() расставь одну пару скобок так, чтобы в консоли вывелось число 12. Остальной код не изменяй.
        •	Метод main() должен выводить число 1*/

package taskiFrom0061To0080;

public class Task0062 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * (number + ++number));
    }
}
