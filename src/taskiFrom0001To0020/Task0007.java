/*Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив. Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение) и количество столбцов (второе измерение). В этой задаче мы будем создавать такой массив.

Для этого реализуй метод main(String[]), который:

Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
Инициализирует двумерный массив multiArray:
количеством строк N;
строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
Пример:

Введено число 5.
Введены числа 1, 7, 5, 9, 3.
Получаем такой массив:
        []
        [][][][][][][]
        [][][][][]
        [][][][][][][][][]
        [][][]
Требования:
        •	В классе должна быть не проинициализированная публичная статическая переменная multiArray типа int[][].*/

package taskiFrom0001To0020;

import java.util.Scanner;

public class Task0007 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size];
        }
    }
}
