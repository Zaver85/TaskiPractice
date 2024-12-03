/*Давай создадим каталог новых моделей авто у нас на производстве.
Для этого нам нужно создать один метод initialize, который будет инициализировать
такие поля объекта типа Car: модель, год выпуска, цвет.

Требования:
•	В классе Car должно быть приватное поле model типа String.
•	В классе Car должно быть приватное поле year типа int.
•	В классе Car должно быть приватное поле color типа String.
•	В классе Car не нужно объявлять какие-либо конструкторы.
•	В классе Car должен быть не статический метод public void initialize с параметрами типа String, int, String.
•	Инициализация полей model, year, color должна производиться в методе initialize(String model, int year, String color).*/

package taskiFrom0101To0120.task0103;

public class Car {
    private String model;
    private int year;
    private String color;

    public void initialize(String model1, int year1, String color1) {
        this.model = model1;
        this.year = year1;
        this.color = color1;
    }
}
