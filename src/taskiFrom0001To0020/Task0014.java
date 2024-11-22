/*Реализуй метод main(String[]), который сортирует массив array по возрастанию.
Для сортировки массива используй метод Arrays.sort(int[]).

Требования:
        •	Реализуй метод main(String[]) согласно условию.*/

package taskiFrom0001To0020;

import java.util.Arrays;

public class Task0014 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        Arrays.sort(array);//напишите тут ваш код
        System.out.println(Arrays.toString(array));
    }
}
