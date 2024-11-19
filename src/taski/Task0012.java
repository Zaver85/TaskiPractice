/*Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
Если длина массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd.
Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
При тестировании значения полей класса будут разными, учти это.

        Требования:
        •	Реализуй метод main(String[]) согласно условию.*/

package taski;

import java.util.Arrays;

public class Task0012 {
    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int size = array.length / 2;

        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                Arrays.fill(array, 0, array.length / 2, valueStart);
                Arrays.fill(array, size, array.length, valueEnd);
            }
        }else {
            Arrays.fill(array, 0, size + 1, valueStart);
            Arrays.fill(array, size + 1, array.length, valueEnd);
        }

        //напишите тут ваш код
        System.out.println(Arrays.toString(array));
    }
}
