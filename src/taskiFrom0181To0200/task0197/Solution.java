/*Напиши программу, которая считывает из консоли имя текстового файла,
далее читает строки из этого файла (используй метод readAllLines(Path) класса Files) и выводит их на экран через одну,
начиная с первой.

Требования:
•	Программа должна считать из консоли путь к файлу.
•	Программа должна вывести в консоли содержимое файла согласно условию.
•	Для чтения строк из файла нужно использовать метод readAllLines(Path) класса Files.
•	Не используй следующие классы: File, FileInputStream, FileOutputStream, FileReader, FileWriter пакета java.io.*/

package taskiFrom0181To0200.task0197;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));

        for (int i = 0; i < lines.size(); i += 2) {
            System.out.println(lines.get(i));
        }
    }
}