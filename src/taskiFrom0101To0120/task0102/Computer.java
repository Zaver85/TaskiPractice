/*Попробуем собрать компьютер.
У нас есть классы: системный блок, монитор, клавиатура, мышь.
В классе компьютер в конструкторе создай объекты классов-составляющих компьютера.

Требования:
•	В отдельных файлах должны быть публичные классы Computer, Keyboard, Monitor, Mouse, SystemUnit.
•	В конструкторе класса Computer нужно создать 4 объекта разных "комплектующих".*/

package taskiFrom0101To0120.task0102;

public class Computer {

    public Computer() {
        new Keyboard();
        new SystemUnit();
        new Mouse();
        new Monitor();
    }
}
