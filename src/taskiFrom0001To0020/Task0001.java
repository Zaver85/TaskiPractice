//Нужно написать программу, которая:
//
//Считывает с консоли целое число N.
//Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
//Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
//Каждое число выводить с новой строки. Число N выводить не нужно.

package taskiFrom0001To0020;

import java.util.Scanner;

public class Task0001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N > 0) {
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            if (N % 2 == 1) {
                for (int i = 0; i < N; i++) {
                    System.out.println(arr[i]);

                }
            } else {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(arr[i]);

                }
            }

        }
    }
}
