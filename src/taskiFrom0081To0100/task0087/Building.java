/*Постройка здания планировалась под ресторан и успешно завершилась,
но спустя некоторое время собственники решили переделать его под барбершоп.
Нам нужно сделать так, чтобы здание было универсальным, и его назначение можно было менять, не создавая нового.
Для этого создай метод initialize, который будет устанавливать значение
полю type (определять тип здания), а конструктор убери.

Требования:
•	В классе Building должно быть приватное поле type типа String.
•	В классе Building не должно быть объявленных конструкторов.
•	В классе Building должен быть не статический метод public void initialize с параметром типа String.
•	Инициализация поля type должна быть в методе initialize(String).*/

package taskiFrom0081To0100.task0087;

public class Building {
    private String type;

    public void initialize(String types) {
        this.type = types;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}
