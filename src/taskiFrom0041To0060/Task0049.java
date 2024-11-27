/*В этой задаче тебе нужно:

Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).
Требования:
        •	Программа должна считывать числа с клавиатуры.
        •	Класс должен содержать только три метода.
•	Метод getArrayOfTenElements() должен считать с клавиатуры 10 чисел, потом вернуть массив
размером 10 элементов, заполненный считанными числами.
•	Метод min(int[]) должен вернуть минимальный элемент массива, используя метод min(int, int)
класса Math.
        •	Метод main() должен вызывать метод getArrayOfTenElements().
        •	Метод main() должен вызывать метод min(int[]).*/

package taskiFrom0041To0060;

import java.util.Arrays;
import java.util.Scanner;

public class Task0049 {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            min = Math.min(min, ints[i]);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
