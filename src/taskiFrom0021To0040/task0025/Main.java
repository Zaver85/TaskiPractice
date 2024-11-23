/*Перед тобой программа, которая выводит информацию о человеке в консоли. К сожалению, она не компилируется.
Измени минимальное необходимое количество модификаторов доступа в классе Person, чтобы код скомпилировался.

        Требования:
        •	Код должен компилироваться.
•	Нужно изменить минимальное необходимое количество модификаторов доступа в классе Person.*/

package taskiFrom0021To0040.task0025;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванов");
        System.out.println("Досье.");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println("Полное имя: " + person.getFullName());
    }
}
