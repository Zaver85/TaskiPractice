/*Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.

Требования:
        •	В методе getPowerOfTwo(int) необходимо возвращать степень двойки.
        •	В методе getPowerOfTwo(int) должен использоваться оператор побитового сдвига влево.*/

package taskiFrom0041To0060;

public class Task0059 {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(6));
    }

    public static int getPowerOfTwo(int power) {
        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power;
        }
    }
}
