/*Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли.
Для этого тебе нужно вызвать конструктор класса Skyscraper в методе main и в теле конструктора
вывести в консоль текст "Небоскреб построен.".

Требования:
•	В классе Task0083 должен быть публичный конструктор без параметров.
•	В методе main тебе нужно создать один объект класса Skyscraper.
•	В конструкторе класса Skyscraper должен выводиться текст "Небоскреб построен." в консоль.*/

package taskiFrom0081To0100;

public class Task0083 {

    public String string;

    public Task0083() {
        System.out.println("Небоскреб построен.");
    }

    public static void main(String[] args) {
        Task0083 str = new Task0083();
    }
}