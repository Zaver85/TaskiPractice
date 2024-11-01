//Считать 6 строк и заполнить ими массив strings.
//Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").

package taski;

import java.util.Scanner;

public class Task4 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }


        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}
