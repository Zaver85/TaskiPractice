/*Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
Напиши программу, которая будет обращаться по ссылке к публичному API в интернете,
отправляя туда данные, получать ответные данные и выводить их на экран.

Подсказки:
Используй метод openConnection() класса URL.
Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
Если не знаешь, какой API использовать, бери http://httpbin.org/post.

Требования:
•	Программа должна выводить полученную информацию на экран.
•	В программе должен вызываться метод openConnection() класса URL.
•	В программе должны вызываться методы setDoOutput(true), getOutputStream() и getInputStream() класса URLConnection.*/

package taskiFrom0201To0220.task0213;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output)) {
            sender.println("Привет");
        }

        try (InputStream input = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}
