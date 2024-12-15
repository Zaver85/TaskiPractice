/*В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе списка.
Все элементы хранятся в приватном списке storage. Твоя задача реализовать все объявленные методы класса MyStack.
Где метод push(String) добавляет элемент в начало списка storage. Метод pop() возвращает первый элемент списка storage,
а потом удаляет его из этого списка. Метод peek() возвращает первый элемент списка storage.
Метод empty() проверяет, не пустой ли список storage. Метод search(String) ищет элемент в списке storage и возвращает его индекс.
Если элемента нет в списке — возвращает -1.

Требования:
•	Метод push(String) должен быть реализован согласно условию.
•	Метод pop() должен быть реализован согласно условию.
•	Метод peek() должен быть реализован согласно условию.
•	Метод empty() должен быть реализован согласно условию.
•	Метод search(String) должен быть реализован согласно условию.*/

package taskiFrom0181To0200.task0189;

import java.util.LinkedList;
import java.util.List;


public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}
