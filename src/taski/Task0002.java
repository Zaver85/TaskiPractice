//Чтобы выполнить эту задачу, тебе нужно:
//
//Ввести с клавиатуры число N.
//Считать N целых чисел и заполнить ими массив.
//Найти минимальное число среди элементов массива и вывести в консоль.

package taski;

import java.util.Scanner;

public class Task0002 {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int number = arr[i];
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);


    }
}
