/*Используя оператор new в методе main(), создай:

        10 объектов типа String;
5 объектов типа int[] (массивов значений int);
        2 объекта типа Scanner.
        Требования:
•	В методе main() должно создаваться 10 объектов типа String.
•	В методе main() должно создаваться 5 объектов типа int[].
•	В методе main() должно создаваться 2 объекта типа Scanner.*/

package taskiFrom0041To0060;

import java.util.Scanner;

public class Task0043 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = new String("Hello");
        String str6 = new String("Hello");
        String str7 = new String("Hello");
        String str8 = new String("Hello");
        String str9 = new String("Hello");
        String str10 = new String("Hello");

        int[] array1 = new int[5];
        int[] array2 = new int[10];
        int[] array3 = new int[20];
        int[] array4 = new int[30];
        int[] array5 = new int[40];

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
    }
}
