/*Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.
Исправь ошибку в коде, чтобы программа работала корректно.

Требования:
•	Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.*/

package taskiFrom0121To0140.task0123;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        String s = line.toLowerCase();
        System.out.println(s);
    }
}
