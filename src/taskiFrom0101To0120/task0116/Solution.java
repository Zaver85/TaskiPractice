/*Кажется, у нас есть лишняя скобка? Или одной не хватает?
Разберись-ка с этой проблемой.

Требования:
•	В методе main класса Solution нужно исправить ошибки компиляции.*/

package taskiFrom0101To0120.task0116;

public class Solution {
    public static void main(String[] args) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.out.println("Windows detected!");
        }
    }
}