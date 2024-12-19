/*Напиши программу, которая будет считывать с клавиатуры строки, и если данная строка — это путь к существующему файлу,
выводить в консоли "<введенная строка> - это файл". Если путь к существующей директории,
выводить в консоли "<введенная строка> - это директория".
Если строка не является путем к файлу или директории, то выходим из программы.
Треугольные скобки и кавычки выводить не нужно.
Для проверки файлов и директорий используй методы isRegularFile() и isDirectory() класса Files.

Пример вывода:
C:\javarush\text.txt - это файл
C:\javarush\ - это директория

Требования:
•	Программа должна считывать из консоли пути к файлам/директориям до тех пор, пока не будет введен некорректный путь.
•	Программа должна выводить в консоли информацию о введенном пути согласно условию.
•	Для проверки файлов и директорий должны быть использованы методы isRegularFile() и isDirectory() класса Files.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/

package taskiFrom0201To0220.task0206;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Solution {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            if (Files.isRegularFile(Path.of(str))) {
                System.out.println(str + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(str))) {
                System.out.println(str + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}
