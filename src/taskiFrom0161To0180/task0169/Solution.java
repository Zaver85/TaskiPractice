/*В enum JavarushQuest хранится список квестов. Твоя задача — получить массив всех элементов
в методе main (используй метод values()) и вывести порядковый номер каждого
из них (используй метод ordinal()) с новой строки.

Требования:
•	В методе main получи список всех констант из enum JavarushQuest с помощью метода values().
•	В методе main выведи порядковый номер каждого элемента с новой строки, используя метод ordinal().*/

package taskiFrom0161To0180.task0169;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javaRush = JavarushQuest.values();
        for (JavarushQuest java : javaRush)
            System.out.println(java.ordinal());
    }
}
