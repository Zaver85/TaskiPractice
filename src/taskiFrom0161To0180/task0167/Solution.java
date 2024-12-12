/*Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
Мы реализовали метод add, который добавляет элементы в конец списка. Тебе нужно реализовать метод get(int),
который вернет строку под индексом, переданным в метод. Если строки с таким индексом нет, нужно вернуть null.
Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно.

Требования:
•	Метод get(int index) должен возвращать элемент, который находится под индексом index в списке.*/

package taskiFrom0161To0180.task0167;

public class Solution {

    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");

        System.out.println(stringLinkedList.get(0)); // должно вывести "1"
        System.out.println(stringLinkedList.get(2)); // должно вывести "3"
        System.out.println(stringLinkedList.get(4)); // должно вывести "5"
        System.out.println(stringLinkedList.get(5)); // должно вывести null
    }
}
