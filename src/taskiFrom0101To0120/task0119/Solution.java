/*Исправь ошибки в коде, чтобы программа компилировалась и работала.

Требования:
•	Программа должна компилироваться и работать.
•	В программе должен быть публичный класс taskiFrom0121To0140.task0121.taskiFrom0141To0160.task0141.Solution.
•	В программе должен быть класс Cat*/

package taskiFrom0101To0120.task0119;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}

class Cat {
    String name = "Tom";
}

